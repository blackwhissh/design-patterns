package com.epam.rd.autocode.observer.git;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GitRepository implements Repository {
    private final List<WebHook> webHooks;
    private final Map<String, List<Commit>> commits;

    public GitRepository() {
        this.webHooks = new ArrayList<>();
        this.commits = new HashMap<>();
    }

    @Override
    public void addWebHook(WebHook webHook) {
        this.webHooks.add(webHook);
    }

    @Override
    public Commit commit(String branch, String author, String[] changes) {
        Commit commit = new Commit(author,changes);
        List<Commit> targetBranchCommits = Optional.ofNullable(commits.get(branch))
                .map(list -> Stream.concat(list.stream(), Stream.of(commit))
                        .collect(Collectors.toList()))
                .orElse(List.of(commit));

        commits.put(branch, targetBranchCommits);

        Event commitEvent = new Event(Event.Type.COMMIT, branch, List.of(commit));

        addEvent(commitEvent);

        return commit;
    }

    @Override
    public void merge(String sourceBranch, String targetBranch) {
        List<Commit> targetBranchCommits = Optional.ofNullable(commits.get(targetBranch))
                .map(ArrayList::new)
                .orElse(new ArrayList<>());
        List<Commit> sourceBranchCommits = commits.get(sourceBranch);

        var difference = sourceBranchCommits.stream()
                .filter(commit -> !targetBranchCommits.contains(commit))
                .collect(Collectors.toList());

        if (!difference.isEmpty()){
            targetBranchCommits.addAll(difference);
            commits.put(targetBranch, targetBranchCommits);

            Event mergeEvent = new Event(Event.Type.MERGE, targetBranch, new ArrayList<>(difference));

            addEvent(mergeEvent);
        }
    }

    private void addEvent(Event event){
        this.webHooks.forEach(webHook -> webHook.onEvent(event));
    }
}

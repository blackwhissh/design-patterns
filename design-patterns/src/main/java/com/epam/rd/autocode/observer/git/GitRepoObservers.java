package com.epam.rd.autocode.observer.git;

public class GitRepoObservers {
    public static Repository newRepository(){
        return new GitRepository();
    }

    public static WebHook mergeToBranchWebHook(String branchName){
        return new WebHookImpl(branchName, Event.Type.MERGE);
    }

    public static WebHook commitToBranchWebHook(String branchName){
        return new WebHookImpl(branchName, Event.Type.COMMIT);
    }

}

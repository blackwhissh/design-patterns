package memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("First Content");
        history.push(editor.createState());

        editor.setContent("Second Content");
        history.push(editor.createState());

        editor.setContent("Third Content");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}

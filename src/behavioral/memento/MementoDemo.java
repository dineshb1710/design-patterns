package behavioral.memento;

/**
 * Below class represents implementation of Memento Design Pattern.
 */
public class MementoDemo {

    public static void main(String[] args) {

        EditorHistory editorHistory = new EditorHistory();
        Editor editor = new Editor(editorHistory);

        editor.setContent("a");
        editor.save();

        editor.setContent("b");
        editor.save();

        editor.setContent("c");
        editor.undo();

        System.out.println(editor.getContent());
        editor.undo();

        System.out.println(editor.getContent());
    }
}

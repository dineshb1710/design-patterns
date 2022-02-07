package behavioral.memento;

public class Editor {

    private String content;
    private EditorHistory editorHistory;

    public Editor(EditorHistory editorHistory) {
        this.editorHistory = editorHistory;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void save() {
        // Save..
        EditorState editorState = new EditorState(content);
        editorHistory.addStateToHistory(editorState);
    }

    public void undo() {
        // Undo..
        this.content = editorHistory.getEditorStateFromHistory().getContent();
    }
}

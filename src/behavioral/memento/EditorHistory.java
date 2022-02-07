package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class EditorHistory {

    private List<EditorState> editorStates = new ArrayList<>();

    public void addStateToHistory(EditorState editorState) {
        editorStates.add(editorState);
    }

    public EditorState getEditorStateFromHistory() {
        int lastIndex = editorStates.size() - 1;
        EditorState lastSavedState = editorStates.get(lastIndex);

        // Remove this item from the list..
        editorStates.remove(lastSavedState);

        return lastSavedState;
    }
}

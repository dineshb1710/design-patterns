package behavioral.state;

public class Canvas {

    private UiControl uiControl;

    public UiControl getUiControl() {
        return uiControl;
    }

    public void setUiControl(UiControl uiControl) {
        this.uiControl = uiControl;
    }

    public void selectTool() {
        uiControl.select();
    }

    public void draw() {
        uiControl.draw();
    }
}

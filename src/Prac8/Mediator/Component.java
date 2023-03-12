package Prac8.Mediator;

public abstract class Component {
    protected final Mediator dialog;

    public Component(Mediator dialog) {
        this.dialog = dialog;
    }

    public void hover() {
        dialog.notify(this, "Hovering");
    }

    public abstract void click();

}

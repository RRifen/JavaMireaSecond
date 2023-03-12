package Prac8.Mediator;

public class LinkComponent extends Component {

    public LinkComponent(Mediator dialog) {
        super(dialog);
    }

    @Override
    public void click() {
        dialog.notify(this, "LinkClicked");
    }
}

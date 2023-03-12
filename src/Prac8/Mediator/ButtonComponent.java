package Prac8.Mediator;

public class ButtonComponent extends Component {

    public ButtonComponent(Mediator dialog) {
        super(dialog);
    }

    @Override
    public void click() {
        dialog.notify(this, "ButtonClick");
    }
}

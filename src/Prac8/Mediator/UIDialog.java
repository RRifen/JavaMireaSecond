package Prac8.Mediator;

public class UIDialog implements Mediator{

    public ButtonComponent getButtonComponent() {
        return buttonComponent;
    }

    public LinkComponent getLinkComponent() {
        return linkComponent;
    }

    private final ButtonComponent buttonComponent;
    private final LinkComponent linkComponent;

    public UIDialog() {
        buttonComponent = new ButtonComponent(this);
        linkComponent = new LinkComponent(this);
    }
    @Override
    public void notify(Component component, String event) {
        if (component == buttonComponent) {
            System.out.println("UIDialog handling button: " + event);
        }
        else if (component == linkComponent) {
            System.out.println("UIDialog handling link: " + event);
        }
    }

}

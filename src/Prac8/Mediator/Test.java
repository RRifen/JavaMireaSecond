package Prac8.Mediator;

public class Test {
    public static void main(String[] args) {
        UIDialog uiDialog = new UIDialog();

        ButtonComponent button = uiDialog.getButtonComponent();
        LinkComponent link = uiDialog.getLinkComponent();

        button.click();
        link.hover();
        link.click();
    }
}

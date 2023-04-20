package dev.minhhd.factoryMethod;

public class WebDialog extends Dialog {
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}

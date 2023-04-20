package dev.minhhd.factoryMethod;

public abstract class Dialog {
    abstract Button createButton();

    protected void render() {
        Button okButton = createButton();
        okButton.render();
    }
}

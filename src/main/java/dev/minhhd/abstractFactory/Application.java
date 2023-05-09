package dev.minhhd.abstractFactory;

public class Application {

    public static void main(String[] args) {
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("win")) {
            WinFactory winFactory = new WinFactory();
            Button winBtn = winFactory.createButton();
            Checkbox winCbx = winFactory.createCheckbox();

            winBtn.render();
            winCbx.render();
        } else if (osName.contains("mac")) {
            MacFactory macFactory = new MacFactory();
            Button macBtn = macFactory.createButton();
            Checkbox macCbx = macFactory.createCheckbox();

            macBtn.render();
            macCbx.render();
        }
    }
}

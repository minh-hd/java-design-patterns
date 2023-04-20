package dev.minhhd.factoryMethod;

public class Application {
    private Dialog dialog;

    public static void main(String[] args) throws Exception {
        Application application = new Application();
        application.initialize("Web");
        application.dialog.render();
    }

    private void initialize(String OS) throws Exception {
        if (OS.equals("Windows")) {
            dialog = new WindowsDialog();
        } else if (OS.equals("Web")) {
            dialog = new WebDialog();
        } else {
            throw new Exception("Unknown operating system");
        }
    }

}

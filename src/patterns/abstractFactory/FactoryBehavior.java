package patterns.abstractFactory;

public interface FactoryBehavior {

    void create();
}

class WindowsFactoryBehavior implements FactoryBehavior{

    @Override
    public void create() {
        Button button = new WindowsButton();
        button.buttonAction();

        Application app = new WindowsApp();
        app.applicationAction();
    }
}

class LinuxFactoryBehavior implements FactoryBehavior{

    @Override
    public void create() {
        Button button = new LinuxButton();
        button.buttonAction();

        Application app = new LinuxApp();
        app.applicationAction();
    }
}

class MacOSFactoryBehavior implements FactoryBehavior{

    @Override
    public void create() {
        Button button = new MacOSButton();
        button.buttonAction();

        Application app = new MacOsApp();
        app.applicationAction();
    }
}
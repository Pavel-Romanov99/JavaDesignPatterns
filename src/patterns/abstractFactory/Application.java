package patterns.abstractFactory;

public interface Application {
    public void applicationAction();
}

class WindowsApp implements Application{

    @Override
    public void applicationAction() {
        System.out.println("I am a Windows app");
    }
}

class LinuxApp implements Application{

    @Override
    public void applicationAction() {
        System.out.println("I am a Linux app");
    }
}

class MacOsApp implements Application{

    @Override
    public void applicationAction() {
        System.out.println("I am a MacOS app");
    }
}
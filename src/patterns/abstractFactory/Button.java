package patterns.abstractFactory;

public interface Button {
    public void buttonAction();
}

class WindowsButton implements Button{

    @Override
    public void buttonAction() {
        System.out.println("I am a windows button");
    }
}

class LinuxButton implements Button{

    @Override
    public void buttonAction() {
        System.out.println("I am a Linux button");
    }
}

class MacOSButton implements Button{

    @Override
    public void buttonAction() {
        System.out.println("I am a MacOS button");
    }
}

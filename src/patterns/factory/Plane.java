package patterns.factory;

public class Plane extends Vehicle{
    Plane(String name, int horsePowers) {
        super(name, horsePowers);
    }

    @Override
    public void getInfo() {
        System.out.println("I am a plane with " + getHorsePowers() + " horse powers");
    }
}

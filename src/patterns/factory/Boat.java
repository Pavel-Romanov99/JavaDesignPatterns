package patterns.factory;

public class Boat extends Vehicle{
    Boat(String name, int horsePowers) {
        super(name, horsePowers);
    }

    @Override
    public void getInfo() {
        System.out.println("I am a boat with " + getHorsePowers() + " horse powers");
    }
}

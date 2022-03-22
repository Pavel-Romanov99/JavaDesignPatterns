package patterns.factory;

public class Car extends Vehicle{

    Car(String name, int horsePowers) {
        super(name, horsePowers);
    }

    @Override
    public void getInfo() {
        System.out.println("I am a car with " + getHorsePowers() + " horse powers");
    }
}

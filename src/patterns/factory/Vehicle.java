package patterns.factory;

public abstract class Vehicle {
    private String name;
    private int horsePowers;

    Vehicle(String name, int horsePowers){
        this.name = name;
        this.horsePowers = horsePowers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    public abstract void getInfo();
}


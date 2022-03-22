package patterns.strategy;

public abstract class Animal {
    private String name;
    private int age;
    private FlyBehavior behavior;

    Animal(String name, int age, FlyBehavior behavior){
        this.name = name;
        this.age = age;
        this.behavior = behavior;
    }

    void tryToFly(){
        behavior.fly();
    }

    abstract void talk();
}

class Dog extends Animal{

    Dog(String name, int age, FlyBehavior behavior){
        super(name, age, behavior);
    }

    @Override
    void talk() {
        System.out.println("Bark");
    }
}

class Bird extends Animal{
    Bird(String name, int age, FlyBehavior behavior){
        super(name, age, behavior);
    }

    @Override
    void talk() {
        System.out.println("Bird noise");
    }

}

package patterns.strategy;

public interface FlyBehavior {
    void fly();
}

class CannotFly implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Hell nah, I cannot fly");
    }
}

class CanFly implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Hell yeah, I can fly");
    }
}
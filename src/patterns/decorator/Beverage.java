package patterns.decorator;

public abstract class Beverage {
    abstract int cost();
    abstract String getDescription();
}

class Cappucino extends Beverage {

    @Override
    int cost() {
        return 1;
    }

    @Override
    String getDescription() {
        return "You have ordered a cappucino with: ";
    }
}

class Espresso extends Beverage{

    @Override
    int cost() {
        return 2;
    }

    @Override
    String getDescription() {
        return "You have ordered an espresso with: ";
    }
}

package patterns.decorator;

public abstract class BeverageAddon extends Beverage{
    private Beverage beverage;

    public BeverageAddon(Beverage beverage){
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }
}

class Cinnamon extends BeverageAddon{

    public Cinnamon(Beverage beverage) {
        super(beverage);
    }

    @Override
    int cost() {
        return 1 + this.getBeverage().cost();
    }

    @Override
    String getDescription() {
        return this.getBeverage().getDescription() + " cinnamon ";
    }
}

class Sugar extends BeverageAddon{

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    int cost() {
        return 2 + this.getBeverage().cost();
    }

    @Override
    String getDescription() {
        return this.getBeverage().getDescription() + " sugar ";
    }
}


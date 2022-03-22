package patterns.observer;

public class Display implements Observer{
    private int temperature;
    private Observable observable;

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        this.temperature = observable.getInfo();
    }

    @Override
    public void display() {
        System.out.println("I am a display with temperature = " + this.temperature);
    }
}

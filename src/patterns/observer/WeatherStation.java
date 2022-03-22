package patterns.observer;

import java.util.ArrayList;
import java.util.Arrays;

public class WeatherStation implements Observable{

    private ArrayList<Observer> observers;
    private int temperature;

    public WeatherStation(int temperature, Observer ...observers){
        this.temperature = temperature;
        this.observers = new ArrayList<>(Arrays.asList(observers));
        for (Observer o: observers){
            o.setObservable(this);
        }
    }

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: this.observers){
            o.update();
            o.display();
        }
    }

    @Override
    public int getInfo() {
        return temperature;
    }

    public void changeData(int temperature){
        this.temperature = temperature;
        this.notifyObservers();
    }
}

package patterns.observer;

public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
    int getInfo();
    void changeData(int value);
}



package patterns.observer;

public interface Observer {
    void update();
    void display();
    void setObservable(Observable o);
}

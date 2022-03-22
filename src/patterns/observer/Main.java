package patterns.observer;

/*
    Когато имаме някакъв обект, който трябва да уведоми много други обекти при всяка своя промяна използваме
    Observer pattern. Това става като имаме интерфейс от обекта, който се наблюдава. Той съдържа лист от обектите
    които го наблюдават и при промяна ги известява чрез updateObservers(), като за всеки обект, наблюдаващ главния
    се извикват методите update() and display().
 */

public class Main {
    public static void main(String[] args) {
        Observer a = new Display();
        Observer b = new Display();
        Observer c = new Display();

        Observable station = new WeatherStation(21, a, b, c);
        station.changeData(15);

    }
}

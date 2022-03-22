package patterns.decorator;

/*
Имаме компонент, който играе централна част в нашата структура. В случая това е Beverage.
Той може да бъде различни напитки, които имат еднакви методи, затова той е под формата на
абстрактен клас. Всяка от нашите напитки (Еспресо и капучино) го наследяват.
Всяка напитка може да има добавки към нея. Това се осъществява чрез абстрактен клас BeverageAddon,
който наследява Beverage, но в същото време приема Beverage като променлива в себе си с цел правенето на
връзката между питиетата и добавките.
Пример:
    Beverage cinnamon = new Cinnamon( new Caramel ( new Espresso)));
    sout(cinnamon.cost());
    sout(cinnamon.getDescription());
    Рекурсивно се получават методите като нашето питие в случая Еспресото е дъното на рекусията.
 */

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Cinnamon(new Sugar(new Cappucino()));
        System.out.println(coffee.getDescription() + " " + coffee.cost());
    }
}

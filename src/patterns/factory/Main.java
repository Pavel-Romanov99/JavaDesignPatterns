package patterns.factory;

import java.util.Scanner;

/*
    Фактори патърна ни позволява да създадем обект по време на runtime-а, без да знаем какъв трябва да е
    той предварително. Factory class-a отговаря изцяло за създаването на нови обекти.

    It also allows you to encapsulate object creation so that you can keep all object creation code in one place.

    Encapsulating the decision making of what EnemyShip to create in the Factory, you avoid duplication of code (yes, youd said it).
     But I can imagine coders thinking "WHERE!?". Well if you don't do it in the Factory class,
     then you are gonna put that logic in every place that you may need to create an EnemyShip, such as the main() method you used in the first example.


 */

public class Main {
    public static void main(String[] args) {

        VechicleFactory factory = new VechicleFactory();
        factory.createVehicle("Mercedes", 10).getInfo();
        factory.createVehicle("Delta", 1000).getInfo();

    }
}

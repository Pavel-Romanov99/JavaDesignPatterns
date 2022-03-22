package patterns.factory;

import java.util.Scanner;

public interface Factory {
    Vehicle createVehicle(String name, int hp);
}

class VechicleFactory implements Factory{

    @Override
    public Vehicle createVehicle(String name, int hp){

        Scanner sc = new Scanner(System.in);
        System.out.println("What vehicle do you want to create? (Car/ Plane/ Boat)");

        if(sc.hasNextLine()){
            if(sc.nextLine().equals("Car")){
                return new Car(name, hp);
            }else if(sc.nextLine().equals("Plane")){
                return new Plane(name, hp);
            }else if(sc.nextLine().equals("Boat")){
                return new Boat(name, hp);
            }
            System.out.println("Invalid input");
        }
        return null;
    }
}
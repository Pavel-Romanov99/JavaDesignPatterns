package patterns.abstractFactory;

import java.util.Scanner;

public class Factory {
    FactoryBehavior factoryBehavior;

    public void setFactoryBehavior(FactoryBehavior factoryBehavior) {
        this.factoryBehavior = factoryBehavior;
    }

    public void createProduct(){

        System.out.println("Please enter the name of the operating system you want: ( Windows/ Linux/ MacOS )");
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextLine()){

            String input = sc.nextLine();
            if(input.equals("Windows")){
                this.setFactoryBehavior(new WindowsFactoryBehavior());
            }else if(input.equals("Linux")){
                this.setFactoryBehavior(new LinuxFactoryBehavior());
            }else if(input.equals("MacOS")){
                this.setFactoryBehavior(new MacOSFactoryBehavior());
            }else System.out.println("Invalid input");
        }
        this.factoryBehavior.create();
    }
}

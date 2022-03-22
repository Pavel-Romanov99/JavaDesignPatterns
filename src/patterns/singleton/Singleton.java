package patterns.singleton;

/*
    The idea is to create a class that can only be instantiated once. The constructor is private so as not to allow
    anyone to create other instances of the class.

    Everyone has global access to it.

    When calling getInstance() for the first time the instance is created and returned. From then on it returns the same instance.

    It is bad practise to use it.
 */


public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void message(){
        System.out.println("This is a message from the Singleton");
    }
}

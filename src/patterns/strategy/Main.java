package patterns.strategy;


/*
    Когато искаме да имаме един алгоритъм, който да се изпълнява по различен начин в зависимост
    от клиента, който го изпълнява използваме Strategy Pattern.
        - Създаваме интерфейс, който дефинира поведението, което искаме
        - След това чрез имплементирането на този интерфейс можем да си дефинираме различни поведения
          в зависимост от клиента, който ще ги ползва.
        - Всеки клиент has-a поведение, което се дефинира в конструктора и може да се извика за да се изпълни
          това поведение.
 */

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Djaro", 7, new CannotFly());
        Animal bird = new Bird("Djaro", 7, new CanFly());

        bird.talk();
        bird.tryToFly();

        dog.talk();
        dog.tryToFly();
    }
}

package patterns.abstractFactory;

/*
    Абстрактната фабрика се използва, когато искаме да създадем повече от 1 свързани обекти. (както в нашия пример)
    Това се постига чрез създаването на интерфейс, който дефинира поведението на 3 различни фабрики и в зависимост
    от тази, която ни трябва се създават посочените обекти.

    Може и да е мое съчинение, но счетох, че най-добре това се постига чрез съчетанието с Стратеги патърна, за да направим
    така, че всяка една от нашите фабрики да има свое поведение и чрез финалния Factory клас да можем да я създадем по
    време на изпълнението на програмата.

 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.createProduct();
    }
}

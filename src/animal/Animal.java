package animal;

public abstract class Animal {
    abstract String makeSound();

    public static void main(String[] args) {
        // test here!
    }
}
interface Editable{
    abstract String howToEat();
}
class Tiger extends Animal{
    @Override
    String makeSound() {
        return "Tiger make sound!";
    }
}
class Chicken extends Animal implements Editable{
    @Override
    String makeSound() {
        return "Chicken make sound!";
    }

    @Override
    public String howToEat() {
        return "Don't know how to eat Chicken!";
    }
}
abstract class Fruit implements Editable{
}
class Orange extends Fruit{
    @Override
    public String howToEat() {
        return "Don't know how to eat Orange!";
    }
}
class Apple extends Fruit{
    @Override
    public String howToEat() {
        return "Don't know how to eat Apple!";
    }
}

// Base class
class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

// Single inheritance
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking.");
    }
}

// Multilevel inheritance
class BabyDog extends Dog {
    public void weep() {
        System.out.println("The baby dog is weeping.");
    }
}

// Hierarchical inheritance
class Cat extends Animal {
    public void meow() {
        System.out.println("The cat is meowing.");
    }
}

// Multiple inheritance (achieved using interfaces)
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("The duck is flying.");
    }
    public void swim() {
        System.out.println("The duck is swimming.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Single inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // Multilevel inheritance
        BabyDog babyDog = new BabyDog();
        babyDog.eat();
        babyDog.bark();
        babyDog.weep();

        // Hierarchical inheritance
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        // Multiple inheritance
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}

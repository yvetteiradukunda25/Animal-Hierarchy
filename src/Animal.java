public class Animal {
    String name;
    public Animal(String name) {
        this.name = "Animal";
    }
    public void makeSound() {
        System.out.println("Animal sounds:");
    }
}

//Dog

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

//Cat

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
// Bird
class Bird extends Animal {
    public Bird( String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }

    public void fly() {
        System.out.println("Flying!");
    }
}

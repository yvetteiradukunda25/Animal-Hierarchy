public class Animal {
    String name;
    public Animal(String name) {
        this.name = "Animal";
    }
    public void makeSound() {

    }
}

//Dog inheritor

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

//Cat inheritor

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
// Bird inheritor
class Bird extends Animal {
    //bird class constructor
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

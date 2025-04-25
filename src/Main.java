public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Max");
        Cat cat = new Cat("Bubbles");
        Bird bird = new Bird("Blue Jay");

        // Dog
        System.out.print("Dog says: ");
        dog.makeSound();//Outputs the sound that the dog makes.

        // Cat
        System.out.print("Cat says: ");
        cat.makeSound();//Outputs the sound that the cat makes.

        // Bird
        System.out.print("Bird says: ");
        bird.makeSound();//Outputs the sound that the bird makes.

        System.out.print("Bird does: ");
        bird.fly();//Outputs the sound that the bird does(bird flies).

        Animal birdPoly = new Bird("Polly");
        System.out.println("Polymorphic Bird says:");
        birdPoly.makeSound();
    }
}
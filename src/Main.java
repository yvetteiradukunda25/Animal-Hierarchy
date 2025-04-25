public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Max");
        Cat cat = new Cat("Bubbles");
        Bird bird = new Bird("Blue Jay");

        System.out.println("Animal sounds:");

        // Dog output

        System.out.print("Dog says: ");
        dog.makeSound();//Outputs the sound that the dog makes.

        // Cat output

        System.out.print("Cat says: ");
        cat.makeSound();//Outputs the sound that the cat makes.

        // Bird output

        System.out.print("Bird says: ");
        bird.makeSound();//Outputs the sound that the bird makes.

        System.out.print("Bird does: ");
        bird.fly();//Outputs the sound that the bird does(bird flies).

        Animal birdSweet = new Bird("Sweet");
        System.out.println(" Bird Sweet says:");
        birdSweet.makeSound();//it calls the overridden makeSound() in the Bird class,
        // resulting in the output corresponding to a bird's sound.
    }
}
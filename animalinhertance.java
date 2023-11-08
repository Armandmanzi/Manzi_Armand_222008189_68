public class animalinhertance {
    // Define an interface AnimalActions that specifies methods for making a sound
    // and performing an action.
    interface AnimalActions {
        void makeSound();

        void performAction();
    }

    // Create a base class Animal with an attribute name.
    class Animal {
        String name;

        // Constructor to set the name of the animal.
        Animal(String name) {
            this.name = name;
        }

        // Method to introduce the animal.
        void introduce() {
            System.out.println("I am " + name + ", an animal.");
        }
    }

    // Create a class Dog that extends Animal and implements the AnimalActions
    // interface.
    class Dog extends Animal implements AnimalActions {
        Dog(String name) {
            super(name);
        }

        // Implement the makeSound method for a dog.
        @Override
        public void makeSound() {
            System.out.println(name + " barks: Woof! Woof!");
        }

        // Implement the performAction method for a dog.
        @Override
        public void performAction() {
            System.out.println(name + " fetches a ball.");
        }
    }

    // Create a class Cat that extends Animal and implements the AnimalActions
    // interface.
    class Cat extends Animal implements AnimalActions {
        Cat(String name) {
            super(name);
        }

        // Implement the makeSound method for a cat.
        @Override
        public void makeSound() {
            System.out.println(name + " meows: Meow! Meow!");
        }

        // Implement the performAction method for a cat.
        @Override
        public void performAction() {
            System.out.println(name + " climbs a tree.");
        }
    }

    public class InheritanceProgram {
        public static void main(String[] args) {
            // Create a Dog and Cat object and demonstrate their behavior.
            Dog dog = new Dog("KIKI");
            Cat cat = new Cat("KOKO");

            dog.introduce(); // Introduce the dog
            dog.makeSound(); // Make the dog bark
            dog.performAction(); // Demonstrate the dog's action

            cat.introduce(); // Introduce the cat
            cat.makeSound(); // Make the cat meow
            cat.performAction(); // Demonstrate the cat's action
        }
    }

}

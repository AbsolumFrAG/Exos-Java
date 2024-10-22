package Exo26;

public class Pet {
    protected String name;
    protected String species;
    protected int age;

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
    }

    public int getHumanAge() {
        return age;
    }
}

class Dog extends Pet {
    private String favoriteToy;

    public Dog(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    @Override
    public void displayDetails() {
        System.out.println("Dog Details:");
        super.displayDetails();
        System.out.println("Favorite Toy: " + favoriteToy);
        System.out.println("Dog's age in human years: " + getHumanAge());
    }

    @Override
    public int getHumanAge() {
        return age * 7;
    }
}

class Bird extends Pet {
    private double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, "Bird", age);
        this.wingSpan = wingSpan;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bird Details:");
        super.displayDetails();
        System.out.println("Wing Span: " + wingSpan + " meters");
        System.out.println("Bird's age in human years: " + getHumanAge());
    }
}

class TestPets {
    public static void main(String[] args) {
        Dog dog = new Dog("Cooper", 3, "Ball");
        dog.displayDetails();

        System.out.println();

        Bird bird = new Bird("Pelican", 2, 0.5);
        bird.displayDetails();
    }
}
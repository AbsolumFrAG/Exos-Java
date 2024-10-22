package Exo17;

public class Car {
    private String make;
    private String model;
    private int year;

    private static final String DEFAULT_MAKE = "Unknown Make";
    private static final String DEFAULT_MODEL = "Unknown Model";
    private static final int DEFAULT_YEAR = 2000;

    public Car(String make, String model, int year) {
        this.make = (make != null && !make.trim().isEmpty()) ? make : DEFAULT_MAKE;
        this.model = (model != null && !model.trim().isEmpty()) ? model : DEFAULT_MODEL;
        this.year = (year > 1900) ? year : DEFAULT_YEAR;
    }

    public Car() {
        this(DEFAULT_MAKE, DEFAULT_MODEL, DEFAULT_YEAR);
    }

    public void afficherInfos(String numero) {
        System.out.println("Car " + numero + " Make: " + make);
        System.out.println("Car " + numero + " Model: " + model);
        System.out.println("Car " + numero + " Year: " + year);
    }

    public static void main(String[] args) {
        Car voiture1 = new Car("Toyota", "Corolla", 2021);
        voiture1.afficherInfos("1");

        System.out.println();

        Car voiture2 = new Car();
        voiture2.afficherInfos("2");
    }
}
package Exo13;

public class Dog {
    private String name;
    private String color;

    public Dog() {
        this.name = "Unknown";
        this.color = "Unknown";
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void afficherInfos() {
        System.out.println("Dog's Name: " + name);
        System.out.println("Dog's Color: " + color);
    }

    public static void main(String[] args) {
        Dog chien1 = new Dog("Bailey", "Black");
        chien1.afficherInfos();

        Dog chien2 = new Dog();
        chien2.setName("Max");
        chien2.setColor("Brown");
        chien2.afficherInfos();
    }
}

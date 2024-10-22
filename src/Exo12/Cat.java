package Exo12;

public class Cat {
    private String name;
    private int age;

    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }

    public void afficherInfos() {
        System.out.println("Nom du chat : " + name);
        System.out.println("Âge du chat : " + age);
    }

    public static void main(String[] args) {
        Cat chat = new Cat();

        chat.afficherInfos();
    }
}

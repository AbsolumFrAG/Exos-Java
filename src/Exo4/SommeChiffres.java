package Exo4;

import java.util.Scanner;

public class SommeChiffres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier entre 0 et 1000 : ");
        int nombre = scanner.nextInt();

        if (nombre < 0 || nombre > 1000) {
            System.out.println("Le nombre doit être entre 0 et 1000");
            scanner.close();
            return;
        }

        int nombreOriginal = nombre;
        int somme = 0;

        while (nombre > 0) {
            somme += nombre % 10;
            nombre = nombre / 10;
        }

        System.out.println("La somme de tous les chiffres de " + nombreOriginal + " est " + somme);

        scanner.close();
    }
}

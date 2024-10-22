package Exo2;

import java.util.Scanner;

public class ComparaisonChaines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first string: ");
        String premiere = scanner.nextLine();

        System.out.print("Input second string: ");
        String deuxieme = scanner.nextLine();

        boolean contient = deuxieme.contains(premiere);

        System.out.println("If the second string contains the first one? " + contient);

        scanner.close();
    }
}

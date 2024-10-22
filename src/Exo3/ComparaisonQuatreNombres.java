package Exo3;

import java.util.Scanner;

public class ComparaisonQuatreNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int premier = scanner.nextInt();

        System.out.print("Input second number: ");
        int deuxieme = scanner.nextInt();

        System.out.print("Input third number: ");
        int troisieme = scanner.nextInt();

        System.out.print("Input fourth number: ");
        int quatrieme = scanner.nextInt();

        if (premier == deuxieme && deuxieme == troisieme && troisieme == quatrieme) {
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }

        scanner.close();
    }
}

package Exo1;

import java.util.Scanner;

public class SommeNombresImpairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of terms is: ");
        int n = scanner.nextInt();

        System.out.println("The odd numbers are:");

        int somme = 0;
        int nombreImpair = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(nombreImpair);
            somme += nombreImpair;
            nombreImpair += 2;
        }

        System.out.println("The Sum of odd Natural Number upto " + n + " terms is: " + somme);

        scanner.close();
    }
}

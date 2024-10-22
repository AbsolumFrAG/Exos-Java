package Exo7;

import java.util.Arrays;

public class SommeTableau {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int somme = Arrays.stream(tableau).sum();

        System.out.println("La somme est de " + somme);
    }
}

package Exo10;

import java.util.Arrays;
import java.util.HashSet;

public class SequenceConsecutive {
    public static int trouverLongueurSequence(int[] tableau) {
        // Afficher le tableau original
        System.out.println("Original array: " + Arrays.toString(tableau));

        // Si le tableau est vide, retourner 0
        if (tableau.length == 0) {
            return 0;
        }

        // Créer un HashSet pour stocker les éléments uniques
        HashSet<Integer> ensemble = new HashSet<>();
        for (int nombre : tableau) {
            ensemble.add(nombre);
        }

        int longueurMax = 0;

        // Pour chaque nombre dans l'ensemble
        for (int nombre : ensemble) {
            // Si c'est le début d'une séquence (nombre-1 n'existe pas)
            if (!ensemble.contains(nombre - 1)) {
                int nombreCourant = nombre;
                int longueurCourante = 1;

                // Compter la longueur de la séquence
                while (ensemble.contains(nombreCourant + 1)) {
                    nombreCourant++;
                    longueurCourante++;
                }

                longueurMax = Math.max(longueurMax, longueurCourante);
            }
        }

        return longueurMax;
    }

    public static void main(String[] args) {
        int[] tableau = {1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2};
        System.out.println(trouverLongueurSequence(tableau));
    }
}
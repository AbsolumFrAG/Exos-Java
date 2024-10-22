package Exo9;

public class DeplacerZeros {
    public static void deplacerZerosALaFin(int[] tableau) {
        System.out.println("Tableau d'origine :");
        afficherTableau(tableau);

        int positionNonZero = 0;

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] != 0) {
                tableau[positionNonZero] = tableau[i];
                positionNonZero++;
            }
        }

        while (positionNonZero < tableau.length) {
            tableau[positionNonZero] = 0;
            positionNonZero++;
        }

        System.out.println("Après avoir déplacé les 0 à la fin du tableau :");
        afficherTableau(tableau);
    }

    public static void afficherTableau(int[] tableau) {
        for (int nombre : tableau) {
            System.out.print(nombre + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] tableau = {0, 0, 1, 0, 3, 0, 5, 0, 6};
        deplacerZerosALaFin(tableau);
    }
}

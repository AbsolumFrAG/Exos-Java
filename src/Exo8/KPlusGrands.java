package Exo8;

import java.util.Arrays;

public class KPlusGrands {
    public static void trouverKPlusGrands(int[] tableau, int k) {
        int[] copie = Arrays.copyOf(tableau, tableau.length);

        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(tableau));

        // Trouver les k plus grands éléments
        System.out.println(k + " largest elements of the said array are:");
        for (int i = 0; i < k; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < copie.length; j++) {
                if (copie[j] > copie[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap des éléments
            int temp = copie[i];
            copie[i] = copie[maxIndex];
            copie[maxIndex] = temp;

            System.out.print(copie[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] tableau = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;
        trouverKPlusGrands(tableau, k);
    }
}

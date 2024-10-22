package Exo6;

public class PGCD {
    public static int calculerPGCD(int a, int b) {
        if (b == 0)
            return a;

        return calculerPGCD(b, a % b);
    }

    public static void main(String[] args) {
        int nombre1 = 16;
        int nombre2 = 18;

        int pgcd = calculerPGCD(nombre1, nombre2);
        System.out.println("Le PGCD de " + nombre1 + " et " + nombre2 + " est : " + pgcd);
    }
}

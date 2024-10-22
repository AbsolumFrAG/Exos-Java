package Exo5;

import java.util.Scanner;

public class ConversionMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MINUTES_PAR_JOUR = 24 * 60;
        final int MINUTES_PAR_ANNEE = 365 * 24 * 60;

        System.out.print("Entrez le nombre de minutes : ");
        long minutes = scanner.nextLong();

        long annees = minutes / MINUTES_PAR_ANNEE;
        long minutesRestantes = minutes % MINUTES_PAR_ANNEE;
        long jours = minutesRestantes / MINUTES_PAR_JOUR;

        System.out.println(minutes + " minutes correspondent à environ " +
                annees + " ans et " + jours + " jours");

        scanner.close();
    }
}

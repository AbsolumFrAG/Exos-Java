package Exo14;

public class Livre {
    private String titre;
    private String auteur;
    private double prix;

    public Livre() {
        this.titre = "Unknown";
        this.auteur = "Unknown";
        this.prix = 0.0;
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = 0.0;
    }

    public Livre(String titre, String auteur, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    public void afficherInfos(String numLivre) {
        System.out.println(numLivre + " Title: " + titre);
        System.out.println(numLivre + " Author: " + auteur);
        System.out.println(numLivre + " Price: " + prix);
    }

    public static void main(String[] args) {
        Livre livre1 = new Livre();
        Livre livre2 = new Livre("Amatka", "Karin Tidbeck");
        Livre livre3 = new Livre("Altered Carbon", "Richard K. Morgan", 18.9);

        livre1.afficherInfos("Book1");
        System.out.println();
        livre2.afficherInfos("Book2");
        System.out.println();
        livre3.afficherInfos("Book3");
    }
}

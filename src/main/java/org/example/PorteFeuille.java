package org.example;

public class PorteFeuille {
    private String couleur;
    private String porteCarte; // exemple de description
    private int poids;         // en grammes
    private String marque;
    private double solde;      // montant d'argent dans le portefeuille
    private int nbCartes;      // nombre de cartes dans le portefeuille

    // Constructeur
    public PorteFeuille(String couleur, String porteCarte, int poids, String marque) {
        this.couleur = couleur;
        this.porteCarte = porteCarte;
        this.poids = poids;
        this.marque = marque;
        this.solde = 0;
        this.nbCartes = 0;
    }

    // ===== Méthodes demandées =====

    // 1. Récupérer l'argent disponible
    public double getMoney() {
        return solde;
    }

    // 2. Ajouter de l'argent
    public void addMoney(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println(montant + "€ ajoutés. Nouveau solde : " + solde + "€");
        } else {
            System.out.println("Montant invalide !");
        }
    }

    // 3. Vérifier si on a assez d'argent
    public boolean checkMoney(double montant) {
        return solde >= montant;
    }

    // 4. Ajouter une carte
    public void addCard() {
        nbCartes++;
        System.out.println("Nouvelle carte ajoutée. Total cartes : " + nbCartes);
    }

    // 5. Perdre une carte
    public void lostCard() {
        if (nbCartes > 0) {
            nbCartes--;
            System.out.println("Une carte perdue. Total cartes : " + nbCartes);
        } else {
            System.out.println("Aucune carte à perdre !");
        }
    }

    // ===== Getters / Setters pour les autres attributs =====
    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getPorteCarte() {
        return porteCarte;
    }

    public void setPorteCarte(String porteCarte) {
        this.porteCarte = porteCarte;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getNbCartes() {
        return nbCartes;
    }
}

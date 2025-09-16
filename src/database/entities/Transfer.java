package database.entities;

import java.util.Date;

public class Transfer {

    private Voiture voiture ;
    private  Utilisateur utilisateur ;
    private Date date ;
    private  Utilisateur achteur ;
    private  Utilisateur vendeure ;

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAchteur(Utilisateur achteur) {
        this.achteur = achteur;
    }

    public void setVendeure(Utilisateur vendeure) {
        this.vendeure = vendeure;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public Date getDate() {
        return date;
    }

    public Utilisateur getAchteur() {
        return achteur;
    }

    public Utilisateur getVendeure() {
        return vendeure;
    }
}

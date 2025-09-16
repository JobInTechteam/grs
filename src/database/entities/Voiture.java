package database.entities;

public class Voiture {
    private  Utilisateur utilisateur ;

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getModel() {
        return model;
    }

    public int getAnnee() {
        return annee;
    }

    private String matricule ;
    private String model ;
    private int annee ;
}

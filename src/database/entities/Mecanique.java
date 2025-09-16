package database.entities;

public class Mecanique {
    public String getUser_name() {
        return user_name;
    }

    public String getPass_word() {
        return pass_word;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    private  String user_name ;
    private  String pass_word;
    private String nom ;
    private  String prenom ;
    private  String localisation ;
}

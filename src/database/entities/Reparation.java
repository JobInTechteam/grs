package database.entities;

import java.util.Date;

public class Reparation {
    private Mecanique mecanique ;
    private  Voiture voiture ;
    private Date date ;
    private  String composent;
    private  String comment ;

    public void setMecanique(Mecanique mecanique) {
        this.mecanique = mecanique;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setComposent(String composent) {
        this.composent = composent;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Mecanique getMecanique() {
        return mecanique;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public Date getDate() {
        return date;
    }

    public String getComposent() {
        return composent;
    }

    public String getComment() {
        return comment;
    }
}

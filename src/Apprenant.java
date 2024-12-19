import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant extends Personne {
public  Classe classe;
public  ArrayList<Double> notes= new ArrayList<Double>(); ;

    public Apprenant(int Id, String nom, String prenom, String email,Classe claasse,double notes) {
        super(Id, nom, prenom, email);
         this.classe = claasse;
         this.notes = new ArrayList<>();
    }

    public ArrayList<Double> getNotes() {
        return notes;

    }

    public void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }


    @Override // kandiroh afach kanjibo chi methode men classe objet okankhliwha kima hiya
    public String toString() {//ay7Aja ghadi te retourna ra ha string
        return "Apprenant{" +
                "Id=" + getId() +'\''+
                ", nom='" + getNom()+ '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}


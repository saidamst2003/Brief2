import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant extends Personne {
public  Classe classe;
public  ArrayList<Double> notes ;

    public Apprenant(int Id, String nom, String prenom, String email,Classe claasse,ArrayList<notes>) {
        super(Id, nom, prenom, email);
         this.classe = claasse;
         this.notes = new ArrayList<>();
    }
    public class getclaasse()// getId: khaatjib lina classe
    {
        return classe;
    }
    public void setclaasse(Classe classe) {//setID :  tatmodifier
      this.classe = classe ;
    }
    public ArrayList<Double> getNotes(){// getId: khaatjib lina classe
        return notes;
    }


    @Override // kandiroh afach kanjibo chi methode men classe objet okankhliwha kima hiya
    public String toString() {//ay7Aja ghadi te retourna ra ha string
        return "Apprenant{" +
                "Id=" + Id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

}
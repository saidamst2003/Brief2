import java.util.ArrayList;

public class Classe {
    private String nom;
    private Formateur formateur;
    private ArrayList<Apprenant> apprenants = new ArrayList<>();

// contructeur

    public Classe(String nom, Formateur formateur, ArrayList<Apprenant> apprenants) {
        this.nom = nom;
        this.formateur = formateur;
        this.apprenants = apprenants;
    }
    // getters and setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public ArrayList<Apprenant> getApprenants() {
        return apprenants;
    }

    public void setApprenants(ArrayList<Apprenant> apprenants) {
        this.apprenants = apprenants;
    }

}

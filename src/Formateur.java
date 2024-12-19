public class Formateur extends Personne{

    private     String specialite;
    private double salaire;
    Classe classee;

    // contructeur
    public Formateur(int Id, String nom, String prenom, String email, String specialite, double salaire, Classe classee) {
        super(Id, nom, prenom, email);
        this.specialite = specialite;
        this.salaire = salaire;
        this.classee = classee;
    }
    // getters and setters
    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Classe getClassee() {
        return classee;
    }

    public void setClassee(Classe classee) {
        this.classee = classee;
    }




}

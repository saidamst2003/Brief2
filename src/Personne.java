public abstract class Personne {
    private int Id;
    private String nom;
    private String prenom;
    private String email;

    public Personne(int Id,String nom,String prenom, String email){// hado dyal constructur
    this.Id = Id;
    this.nom = nom;
    this.prenom = prenom;
    this.email = email;
    }

    public int getId()// getId: khaatjib lina ID
     {
        return Id;
    }

    public void setId(int id) {//setID :  tatmodifier
        Id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override// kandiroh afach kanjibo chi methode men classe objet okankhliwha kima hiya
    public String toString() {//ay7Aja ghadi te retourna ra ha string
        return "Personne{" +
                "Id=" + Id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


import java.util.*;
class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix = -1;
        while (choix != 0) {//ay5tar 0 ay5reej
            System.out.println("----------MENU PRINCIPAL----------");
            System.out.println("1. Gestion des apprenants:");
            System.out.println("2. Gestion des formateurs:");
            System.out.println("3. Gestion des classes:");
            System.out.println("0. Quitter:");
            System.out.println("votre choix: ");

            choix = scanner.nextInt();//bach n9raw dakchi lidekhel motaghaayer ondiro lih 7ifed fe choix
            switch (choix) {
                case 1:
                    gestionDesApprenants();
                    System.out.println("Vous avez choisi Gestion des Apprenants. ");

                    break;
                case 2:


                    System.out.println("Vous avez choisi Gestion des Formateurs.");

                    break;
                case 3:


                    System.out.println("Vous avez choisi Gestion des classes.");
                    break;
                case 0:


                    System.out.println("Au revoir");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    // ila khtar lina utilisateur chi choix makaynch kantl3o lih had rissala
            }
        }
        scanner.close();
    }


public static void gestionDesApprenants(){
    Scanner scanner = new Scanner(System.in);
    int choix = -1;

    while(choix !=0){
        System.out.println("-------GESTION DES APPRENANTS------");
        System.out.println("1. Ajouter un apprenant");
        System.out.println("2. Afficher tous les apprenants");
        System.out.println("3. Supprimer un Apprenant");
        System.out.println("0. Retour au Menu Principal");
        System.out.println("votre choix: ");
 choix = scanner.nextInt();// kat9ra lina achno 5tar utilisateur
        switch (choix) {
            case 1:
                ajouterApprenant();// dern ahna methode bach t5lina nzido methode jdida1
                break;
            case 2:
                afficherApprenants();
                break;
            case 3:
                supprimerApprenant();
                break;
            case 0:
                System.out.println("Retour au Menu Principal.");
                break;
            default:
                System.out.println("Choix invalide. Veuillez réessayer.");
        }
    }
}

    private static void supprimerApprenant() {
    }

    private static void afficherApprenants() {
    }

    private static void ajouterApprenant() {
    }

}
   
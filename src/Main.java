
import java.util.*;
public class Main {
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

}

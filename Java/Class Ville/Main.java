import java.util.Scanner;

public class Main {

    public static void main(String[] args) {






        int a = 5;

        int b;
        b = 5;




        String chaine = new String("Salut");

        String chaine2;
        chaine2 = new String("Salut");




        //////////////// Objet Ville  ///////

        Ville paris = new Ville();

        /*  car superficie est public*/
        paris.superficie = 32;
        System.out.println(paris.superficie);

        // impossible de faire : paris.nomVille = "paris"; => car privé



        ////////////////////

        Ville ville1 = new Ville("Paris", 50, 10000);
        Ville ville2 = new Ville("Lille", 30, 5000);
        Ville ville3 = new Ville(ville1);

        System.out.println(ville1.toString());
        System.out.println(ville2.toString());
        System.out.println(ville3.toString());



        System.out.println("ville1 et ville3 : "+ ville1.equals(ville3));
        System.out.println("ville1 et ville2 : "+ ville1.equals(ville2));

        ville1.augmenteHabitant(100);
        System.out.println(ville1.toString());
        System.out.println(ville2.toString());
        System.out.println(ville3.toString());

        System.out.println("Addition ville1 et ville2 : " + ville1.additionPopulationVille(ville2));


















    }
}






























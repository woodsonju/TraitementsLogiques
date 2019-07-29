import java.util.Scanner;

public class NombrePremier {

    /**
     * Complexité O(N)
     */
    public static void getNombrePremierV1() {
        Scanner sc = new Scanner(System.in);
        int nb;
        int  diviseur1 = 0;
        int diviseur2 = 0;
        
        System.out.println("Entrez un nombre : ");
        nb  = sc.nextInt();
        
        int limite = nb - 1;
        int nb_itérations = 0;
        boolean trouvé = false;

        if(nb < 2)
            System.out.println("Le nombre doit être supérieur à 1");
        else {
            for(int i=2; i<limite; i++) {
                nb_itérations++;
               if(nb % i == 0) {
                   trouvé = true;
                   diviseur1 = i;
                   diviseur2 = nb / i;
               }
            }
            if(trouvé) {
                System.out.println(nb + " n'est pas prémier !");
                System.out.println("Il est divisible par " + diviseur1 + " et " + diviseur2);
            } else {
                System.out.println(nb + " est un nombre prémier");
            }
            System.out.println("Résultat obtenu en " + nb_itérations + " itérations");
        }
    }
}

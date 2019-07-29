import java.util.Scanner;

public class NombrePremier {

    private static int  diviseur1 = 0;
    private static int diviseur2 = 0;
    private static int nb = saisieNombre();
    private static int nb_iterations = 0;
    private static boolean trouve = false;


    public static int  saisieNombre() {
        Scanner sc = new Scanner(System.in);
        int nb;
        System.out.println("Entrez un nombre : ");
        nb  = sc.nextInt();
        return nb;
    }

    /**
     * Complexité O(N)
     * Equivalent ici à 999999998 itérations 
     * pour nb = 1000000001
     */
    public static void getNombrePremierV1() {
        
        int limite = nb - 1;
        boolean trouvé = false;

        if(nb < 2)
            System.out.println("Le nombre doit être supérieur à 1");
        else {
            for(int i=2; i<limite; i++) {
                nb_iterations++;
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
            System.out.println("Résultat obtenu en " + nb_iterations + " itérations");
        }
    }

    /**
     * Complexité : O((Maths.SQRT(N))/2)
     * Equivalent ici à 15810 itérations 
     * pour nb = 1000000001
     */
    public static void nombrePremierV2(){
        int limite = (int) Math.sqrt(nb) + 1;
        if(nb < 2)
            System.out.println("Le nombre doit être supérieur à 1");
        else {
            int reste = nb % 2;
            if(reste == 0) {
                trouve = true;
                diviseur1 = 2;
                diviseur2 = nb / 2;
            } else {
                for(int i=3; i<limite; i+=2) {
                    nb_iterations++;
                    reste = nb % i;
                    if(reste == 0){
                        trouve = true;
                        diviseur1 = i;
                        diviseur2 = nb / i;
                    }
                }
            }
        }
        if(trouve) {
            System.out.println(nb + " n'est pas prémier !");
            System.out.println("Il est divisible par " + diviseur1 + " et " + diviseur2);
        } else {
            System.out.println(nb + " est un nombre PREMIER !");
        }
        System.out.println("Resultat obtenu en " +  nb_iterations + " itérations");
    }
}

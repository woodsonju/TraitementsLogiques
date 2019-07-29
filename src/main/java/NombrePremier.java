import java.util.Scanner;

public class NombrePremier {

    private static int  diviseur1 = 0;
    private static int diviseur2 = 0;
    private static int nb = saisieNombre();
    private static int nb_iterations = 0;
    private static boolean trouve = false;

    /**
     * L'utilisateur saisie un nombre afin de savoir 
     * si c'est c'est nombre premier par la suite
     * @return nb 
     */
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
     * Temps d'éxecution : 2987.553803 ms
     */
    public static void getNombrePremierV1() {
        int limite = nb - 1;
        if(nb < 2)
            System.out.println("Le nombre doit être supérieur à 1");
        else {
            for(int i=2; i<limite; i++) {
                nb_iterations++;
               if(nb % i == 0) {
                   trouve = true;
                   diviseur1 = i;
                   diviseur2 = nb / i;
               }
            }
        }
    }

    /**
     * Complexité : O((Maths.SQRT(N))/2)
     * Equivalent ici à 15810 itérations 
     * pour nb = 1000000001
     * Temps d'éxecution : 0.474595 ms
     */
    public static void getNombrePremierV2(){
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
    }

    /**
     * Arret le traitemement quand un diviseur est trouvé
     * Complexité : O((Maths.SQRT(N))/2)
     * Resultat obtenu en 3 itérations 
     * pour nb = 1000000001
     * Temps d'éxecution : 0.048034 ms
     */
    public static void getNombrePremierV3(){
        int limite = (int) Math.sqrt(nb) + 1;
        if(nb < 2) 
            System.out.println("Le nombre doit être supérieur à 1");
        else {
            int reste = nb % 2;
            if(reste == 0) {
                trouve = true;
                diviseur1 = 2;
                diviseur2 = nb / 2;
            }
            int i = 3;
            while ((!trouve) && (i<=limite)){
                nb_iterations++;
                reste = nb % i;
                if(reste == 0) {
                    trouve = true;
                    diviseur1 = i;
                    diviseur2 = nb / i;
                }
                i+=2;
            }
        }
    }


    /**
     * Arret le traitemement quand un diviseur est trouvé
     * Complexité : O(N)
     * Resultat obtenu en 6 itérations 
     * pour nb = 1000000001
     * Temps d'éxecution : 0.004926 ms
     */
    public static void getNombrePremierV4(){
        int limite = nb - 1;
        if(nb < 2)
            System.out.println("Le nombre doit être supérieur à 1");
        else {
            int i = 2;
            while ((!trouve) && (i<=limite)){
                nb_iterations++;
                if(nb % i == 0) {
                    trouve = true;
                    diviseur1 = i;
                    diviseur2 = nb / i;
                }
                i++;
            }
        }
    }

    /**
     * Affiche les résultats
     */
    public static void affichage_resultat() {
        if(trouve) {
            System.out.println(nb + " n'est pas prémier !");
            System.out.println("Il est divisible par " + diviseur1 + " et " + diviseur2);
        } else {
            System.out.println(nb + " est un nombre PREMIER !");
        }
        System.out.println("Resultat obtenu en " +  nb_iterations + " itérations");
    }

        /**
         * Obtenir le temps d'execution pour la méthode 
         * getNombrePremierV1
         */
    public static void getTimeExecutionGetNombrePremierV1() {
        long debut = System.nanoTime();
        getNombrePremierV1();
        long fin =  System.nanoTime();
        long totalTime = fin - debut;
        double totalTimeMS = (double) totalTime / 1000000;
        System.out.println("Temps d'éxecution : " + totalTime + " ns");
        System.out.println("Temps d'éxecution : " + totalTimeMS + " ms");
    }

    /**
     * Obtenir le temps d'execution pour la méthode 
     * getNombrePremierV2
     */
    public static void getTimeExecutionGetNombrePremierV2() {
        long debut = System.nanoTime();
        getNombrePremierV2();
        long fin =  System.nanoTime();
        long totalTime = fin - debut;
        double totalTimeMS = (double) totalTime / 1000000;
        System.out.println("Temps d'éxecution : " + totalTime + " ns");
        System.out.println("Temps d'éxecution : " + totalTimeMS + " ms");
    }

    /**
     * Obtenir le temps d'execution pour la méthode 
     * getNombrePremierV3
     */
    public static void getTimeExecutionGetNombrePremierV3() {
        long debut = System.nanoTime();
        getNombrePremierV3();
        long fin =  System.nanoTime();
        long totalTime = fin - debut;
        double totalTimeMS = (double) totalTime / 1000000;
        System.out.println("Temps d'éxecution : " + totalTime + " ns");
        System.out.println("Temps d'éxecution : " + totalTimeMS + " ms");
    }

    /**
     * Obtenir le temps d'execution pour la méthode 
     * getNombrePremierV4
     */
    public static void getTimeExecutionGetNombrePremierV4() {
        long debut = System.nanoTime();
        getNombrePremierV4();
        long fin =  System.nanoTime();
        long totalTime = fin - debut;
        double totalTimeMS = (double) totalTime / 1000000;
        System.out.println("Temps d'éxecution : " + totalTime + " ns");
        System.out.println("Temps d'éxecution : " + totalTimeMS + " ms");
    }
}

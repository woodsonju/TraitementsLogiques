public class Puissance {
    
    private static  double nombre;
    private static int exposant;
    
    public static void getPuissance(double nombre, int exposant) {
        int compteur = 0;
        double resultat = 1;
        while(compteur < exposant) {
            resultat *= nombre;
            compteur ++;
        }
        System.out.println(nombre + " à la exposant " + exposant
        + " = " + resultat);
    }
}

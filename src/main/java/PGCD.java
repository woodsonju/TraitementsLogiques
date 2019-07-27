import java.util.Scanner;

public class PGCD {
    private static int numerateur;
    private static int denominateur; 
    public static void getPGCD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez deux nombres: ");
        numerateur = sc.nextInt();
        denominateur = sc.nextInt();
        int cpt = 0;
        while(denominateur != 0){
            int k = numerateur % denominateur;
            numerateur = denominateur;
            denominateur = k;
            cpt ++;
        }
        System.out.println("Résultat : " + numerateur);
        System.out.println("Nombre d'itération : " + cpt);
    }
    
}

package pgcd;

import java.util.Scanner;

public class PGCD {
    private static int dividende;
    private static int diviseur; 
    public static void getPGCD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez deux nombres: ");
        dividende = sc.nextInt();
        diviseur = sc.nextInt();
        int cpt = 0;
        while(diviseur != 0){
            int k = dividende % diviseur;
            dividende = diviseur;
            diviseur = k;
            cpt ++;
        }
        System.out.println("Résultat : " + dividende);
        System.out.println("Nombre d'itération : " + cpt);
    }
    
}

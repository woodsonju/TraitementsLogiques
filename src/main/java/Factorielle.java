import java.util.Scanner;

public class Factorielle {
    
    public static void getFactorielle() { 
        Scanner sc = new Scanner(System.in);
        int resultat = 1;
        System.out.println("Entrez un nombre positif : ");
        int x = sc.nextInt();
        for(int i=1; i<=x; i++){
            resultat *= i;
        }
        System.out.println("Factorielle de " + x + " = " + resultat);
    }
    
    public static  void getFactorielleRecursive() {
        
    }
}

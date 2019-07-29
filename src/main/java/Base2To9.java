import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Base2To9 {
    private static List<Integer> resultat = new ArrayList<Integer>();
            
    public static void getBase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre entier : ");
        int nb10= sc.nextInt();
        int nbQuotient = nb10;
        System.out.println("Base de conversion : ");
        int base = sc.nextInt();
        if(nb10 < base)
        {
            System.out.println(nb10 + " en base " + base + " = " + nb10);
            return; 
        }
        while(nbQuotient != 0){
            int nbReste = nbQuotient % base;
            resultat.add(nbReste);
            nbQuotient /= base;
        } 
        Collections.reverse(resultat);
        System.out.println(nb10 + " en base " + base + " = " + resultat);
    }
}

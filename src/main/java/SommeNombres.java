import java.util.Locale;
import java.util.Scanner;

public class SommeNombres {
    private static double nb = 0;
    private  static double somme = 0;

    public static void addition() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        while(nb != -1) {
            System.out.println("Entrez un nombre(-1 pour sortir) : ");
            nb = sc.nextDouble();
            if(nb != -1)
                somme += nb;
        }
        System.out.println("La somme de ces nombres est :  " + somme);

    }
    
}

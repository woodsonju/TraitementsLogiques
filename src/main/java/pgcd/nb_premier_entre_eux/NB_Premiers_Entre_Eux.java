package pgcd.nb_premier_entre_eux;

import java.util.Scanner;

public class NB_Premiers_Entre_Eux {
    private  double nbpremiers;
    private  double nbTirages;
    
    public double getNbPremiers(int n, int nbtirages) {
        this.nbTirages = nbtirages;
        int i = 1;
        while (i < nbtirages) {
            i++;
            int a = (int)((Math.random() * ((n - 1) + 1)) + 1);
            int b = (int) ((Math.random() * ((n - 1) + 1)) + 1);
            if (this.getPGCD(a, b) == 1)
                this.nbpremiers++;
        }
        return this.nbpremiers;
    }
    
    public int getPGCD(int a, int b) {
        if(a%b == 0)
            return b;
        else
            return getPGCD(b, a%b);
    }
    
    public double getProbabilite() {
        return nbpremiers /  nbTirages;
    }

    public static void main(String[] args) {
        NB_Premiers_Entre_Eux nb_premiers_entre_eux = new NB_Premiers_Entre_Eux();
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre maximal pour le calcul du PGCD :  ");
        int n = sc.nextInt();
        System.out.print("Entrez le nombre de tirages :  " );
        int nbtirages = sc.nextInt();

        System.out.println("nbpremiers : " + nb_premiers_entre_eux.getNbPremiers(n, nbtirages));
        System.out.println("Probabilité : " + nb_premiers_entre_eux.getProbabilite());
    }
}

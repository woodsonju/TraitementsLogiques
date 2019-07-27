import java.util.Locale;
import java.util.Scanner;

public class Emprunt2 {
    private int nbAn, nbMois;
    private double capital, tauxMensuel, tauxAnnuel, tauxAssurance;
    private double capRestant, amortis, interet;
    private double mensualiteHA,  mensualiteAC, coutAss;

    public Emprunt2() {
    }

    public Emprunt2(double capital, int nbAn, double tauxAnnuel, double tauxAssurance) {
        this.nbAn = nbAn;
        this.capital = capital;
        this.tauxAnnuel = tauxAnnuel;
        this.tauxAssurance = tauxAssurance;
    }

    public void saisie_donnee() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Capital : ");
        capital = sc.nextDouble();
        System.out.println("Nombre d'années : ");
        nbAn = sc.nextInt();
        System.out.println("Taux annuel hors assurance : ");
        tauxAnnuel = sc.nextDouble();
        System.out.println("Taux assurance : ");
        tauxAssurance = sc.nextDouble();
    }
    
    public void affichage_mensualite() {
        nbMois = nbAn*12;
        tauxMensuel = (tauxAnnuel/100)/12;
        double calcul1 = capital*tauxMensuel;
        double calcul2 = Math.pow((1+tauxMensuel),nbMois);
        double calcul3 = calcul2 - 1;
        coutAss = (capital*(tauxAssurance/100))/12;
        mensualiteHA= calcul1*(calcul2/calcul3);
        mensualiteAC = mensualiteHA + coutAss;
        System.out.println("Mensualité hors assurance : " + mensualiteHA);
        System.out.println("Coût assurance par mois : " + coutAss);
        System.out.println("Mensualite avec assurance : " + mensualiteAC);
    }
    
    public void affichage_amortissement() {
        capRestant = capital;
        System.out.println("Mensualité " + "Amortissement " + "Intérêts " + "Capital " + "Ass.");
        for(int i=0; i<nbMois; i++) {
            double calcul1 = capital*tauxMensuel;
            double calcul2 = Math.pow((1+tauxMensuel),nbMois-1);
            double calcul3 = calcul2 - 1;
        }
        /*
            CapRestant <- Capitaal 
    Ecrire("Mensualité ", "Amortissement ", "Intérêts ", "Capital ", "Ass.")
    Pour i variant de 1 à NbMois Faire 
        Calcul1 <- CapRestant*TauxMensuel
        Calcul2 <- (1+TauxMensuel)**(NbMois-i)
        Calcul3 <- Calcul2 - 1
        MensualiteHA <- Calcul1*(Calcul2/Calcul3)
        MensualiteAC < MensualiteHA + CoutAss
        Intérêts <- Calcul1
        Amortis <- MesualiteHA - Intérêts
        CapRestant <- CapRestant - Amortis
        Ecrire(MensualiteAC, " ", Amortis, " ", Intérêts, " ", CapRestant, " ", CoutAss)
         */
    }
    
    public void runMain() {
        this.saisie_donnee();
        this.affichage_mensualite();
    }

    public double getMensualiteHA() {
        return mensualiteHA;
    }

    public double getMensualiteAC() {
        return mensualiteAC;
    }

    public double getCoutAss() {
        return coutAss;
    }
}

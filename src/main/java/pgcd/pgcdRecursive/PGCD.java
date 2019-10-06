package pgcd.pgcdRecursive;

import java.util.Scanner;

public class PGCD {
    
    public static int getPGCD(int a, int b) {
        if(a%b == 0)
            return b;
        else
            return getPGCD(b, a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez deux nombre entier : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("PGCD : " + getPGCD(a,b));
    }
}


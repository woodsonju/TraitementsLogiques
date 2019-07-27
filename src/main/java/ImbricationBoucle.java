public class ImbricationBoucle {

     public static void getNombreIterationBoucleImbriquee() {
         for (int i = 0; i < 4; i++) {
             System.out.println("Boucle externe, itération : " + i);
             for (int j = 0; j < 5; j++) {
                 System.out.println("interne: " + j);
             }
         }
     }  
}

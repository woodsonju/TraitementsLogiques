import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Emprunt2Test {

    private  Emprunt2 emprunt2;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Test
    public void saisie_donnees() {
        System.setIn(new ByteArrayInputStream("10000\n1\n1.8\n0.25\n".getBytes()));
        emprunt2 = new Emprunt2();
        emprunt2.saisie_donnee();
        String[] output = outContent.toString().replace("\r\n", "\n").split("\n");
        assertEquals("Capital : ", output[0]);
        assertEquals("Nombre d'années : ", output[1]);
        assertEquals("Taux annuel hors assurance : ", output[2]);
        assertEquals("Taux assurance : ", output[3]);
    }

    @Test
   public void affichage_mensualite() {
        emprunt2 = new Emprunt2(10000, 1,1.8,0.25 );
        emprunt2.affichage_mensualite();
        String output = outContent.toString().replace("\r\n", "\n");
        assertEquals(841.48 , emprunt2.getMensualiteHA(), 0.01);
        assertEquals(2.08 , emprunt2.getCoutAss(), 0.01);
        assertEquals(843.56 , emprunt2.getMensualiteAC(), 0.01);
    }
    
    @Test
    public void affichage_amortissement(){
        emprunt2 = new Emprunt2(10000, 1,1.8,0.25 );
        emprunt2.affichage_amortissement();
        assertEquals(843.56, emprunt2.getMensualiteAC(), 0.01);
        assertEquals(826.48, emprunt2.getAmortis(), 0.01);
        assertEquals(15.00, emprunt2.getInteret(), 0.01);
        assertEquals(9173.52, emprunt2.getCapRestant(), 0.01);
        assertEquals(2.08, emprunt2.getCoutAss(), 0.01);
    }
}
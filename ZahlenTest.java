import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Die Test-Klasse ZahlenTest.
 *
 * @author  p6majo
 * @version 2022-02-04
 */
public class ZahlenTest
{
    
    private ZahlenAddieren zahlenAddieren;
    

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @BeforeEach
    public void setUp()
    {
        zahlenAddieren = new ZahlenAddieren();
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testeKarimsMethode()
    {
        assertEquals(5050, zahlenAddieren.Zahlen());
    }

    @Test
    public void testeMethodeMitParameter()
    {
         int grenze = 10;
         long [] erwarteteErgebnisse=new long[]{55,5050,500500,50005000,5000050000l};
        for (int i=0;i<5;i++){
            int ergebnis = zahlenAddieren.zahlen2(grenze);
            System.out.println("Summe der Zahlen bis "+grenze+": "+ ergebnis);
            grenze = grenze*10;
            assertEquals(erwarteteErgebnisse[i],ergebnis);
            //sollte einen Fehler zeigen, weil fuer grosse Summen der int-Bereich verlassen wird
            //TODO: Umschreiben der Methode auf long
        }
    }
}



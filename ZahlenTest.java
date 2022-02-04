

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
    public void testeAlles()
    {
        assertEquals(5050, zahlenAddieren.Zahlen());
    }

    @Test
    public void parameterTest()
    {
         int grenze = 10;
        for (int i=0;i<5;i++){
            System.out.println("Summe der Zahlen bis "+grenze+": "+zahlenAddieren.zahlen2(grenze) );
            grenze = grenze*10;
        }
    }
}



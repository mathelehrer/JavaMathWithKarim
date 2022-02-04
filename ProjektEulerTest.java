import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjektEulerTest {
    @Test
    public void problem9Test(){
        ProjektEuler pe = new ProjektEuler();
        int result = pe.problem9();
        System.out.println(result);
        assertEquals(result,31875000);
    }

}
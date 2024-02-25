/**
 * Clase para probar el funcionamiento del código
 * @author Allison López
 * @since 2024-02
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosNulos() {
        LOG.info("Iniciado test de datos nulos");
        
        assertThrows(Throwable.class, () -> new Mascota(null, null, null, (byte)3, "femenino", "blanco", (Double) 10.2) );


        LOG.info("Finalizando test de datos nulos");
    }
}

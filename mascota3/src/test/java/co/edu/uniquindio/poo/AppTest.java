/**
 * Clase para probar el funcionamiento del código
 * @author Allison López
 * @since 2024-02
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

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
    public void FemeninoMasculino() {
        LOG.info("Iniciado test mascota de genero femenino o masculino");

        Mascota mascota = new Mascota("Praga", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco", (double)10.2);
       


        LOG.info("Finalizando test mascota de genero femenino o masculino");
    }
}

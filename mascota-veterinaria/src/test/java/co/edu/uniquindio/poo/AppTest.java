/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import co.Mascota;


/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

   @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datos completos");

        Mascota mascota = new Mascota("Praga","123456", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco", 10.2);

        assertEquals("Praga", mascota.nombre());
        assertEquals( 123456, mascota.Id());
        assertEquals("Perro", mascota.especie());
        assertEquals("Pomerania", mascota.raza());
        assertEquals((byte) 3, mascota.edad());
        assertEquals("Femenino", mascota.genero());
        assertEquals("Blanco", mascota.color());
        assertEquals(10.2, mascota.peso());

        LOG.info("Finalizando test datos completos");
    }

    @Test
    public void FemeninoMasculino() {
        LOG.info("Iniciado test mascota de genero femenino o masculino");

        Mascota mascota = new Mascota("Praga","123456", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco", 10.2);

        String genero = mascota.genero();

        if(genero.equalsIgnoreCase("masculino") || genero.equalsIgnoreCase("femenino")) {

        } else {
            throw new IllegalArgumentException("El género debe ser 'masculino' o 'femenino'.");
        }

        LOG.info("Finalizando test mascota de genero femenino o masculino");
    }

    @Test
    public void EdadNoMayor300() {
        LOG.info("Iniciado test edad no mayor a 300");

        Mascota mascota = new Mascota("Praga","123456", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco", 10.2);

        if (mascota.edad() > 300) {
            throw new IllegalArgumentException("La edad no puede ser mayor a 300 años");
        }

        LOG.info("Finalizando test edad no mayor a 300");
    }


    @Test
    public void datosNulos(){
        LOG.info("Inicio datosNulos");

        assertThrows(Throwable.class, () -> new Mascota(null, "123456", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco",(double) 10.2));

        LOG.info("Fin datosNulos");
    }

    @Test
    public void datosVacios(){
        LOG.info("Inicio test datos nulos");

        
        assertThrows(Throwable.class, () -> new Mascota("","123456", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco", (double)10.2));


        LOG.info("Fin datosNulos");
    }


}
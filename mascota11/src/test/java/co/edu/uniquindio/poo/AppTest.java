/**
 * Clase para probar el funcionamiento del código
 * @author Allison López 
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

   @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datos completos");

        Mascota mascota = new Mascota("Praga", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco", 10.2);

        assertEquals("Praga", mascota.nombre());
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

        Mascota mascota = new Mascota("Praga", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco", 10.2);

        String genero = mascota.genero();
            
        if(genero.equalsIgnoreCase("masculino") || genero.equalsIgnoreCase("femenino")) {
           
        } else {
            throw new IllegalArgumentException("El género debe ser 'masculino' o 'femenino'.");
        }

        LOG.info("Finalizando test mascota de genero femenino o masculino");
    }

    @Test
    public void EdadNoMayor30() {
        LOG.info("Iniciado test edad no mayor a 30");

        Mascota mascota = new Mascota("Praga", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco", 10.2);

        if (mascota.edad() > 30) {
            throw new IllegalArgumentException("La edad no puede ser mayor a 30 años");
        }

        LOG.info("Finalizando test edad no mayor a 30");
    }

    @Test
    public void NombreConLetras() {
        LOG.info("Iniciado test nombre solo con letras");

        Mascota mascota = new Mascota("Praga", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco", 10.2);

        String nombre = mascota.nombre();
        if (!nombre.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("El nombre solo permite letras");
        }

        LOG.info("Finalizando test nombre solo con letras");

    }

    @Test
    public void Peso() {
        LOG.info("Iniciado test peso entre un rango");

        Mascota mascota = new Mascota("Praga", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco", 10.2);

        double peso = mascota.peso();
        if (peso < 0 || peso > 100) {
            throw new IllegalArgumentException("El peso debe de estar entre 0 Kg y 100Kg");
        }

        LOG.info("Finalizando test peso entre un rango");
    }
}

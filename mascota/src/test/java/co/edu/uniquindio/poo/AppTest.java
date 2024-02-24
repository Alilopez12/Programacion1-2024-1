/**
 * Clase para probar el funcionamiento del código de la veterinaria
 * @author Allison López
 * @since 2024-02
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

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datos completos");
       

        Mascota mascota = new Mascota("Praga", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco", (Double)10.2);

        assertEquals("Praga",mascota.nombre());
        assertEquals("Perro", mascota.especie());
        assertEquals("Pomerania", mascota.raza());
        assertEquals((byte) 3, mascota.edad());
        assertEquals("Femenino", mascota.genero());
        assertEquals("Blanco", mascota.color());
        assertEquals((Double) 10.2, mascota.peso());
      


        LOG.info("Finalizando test datos completos");
    }

  
    
}
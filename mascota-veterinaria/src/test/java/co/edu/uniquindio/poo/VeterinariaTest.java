package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import co.Veterinaria;
import co.Mascota;

public class VeterinariaTest {

    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    @Test
    public void datosCompletos() {
        LOG.info("Inicio test datos completos");

        Veterinaria veterinaria = new Veterinaria("Amigos peludos");
        assertEquals("Amigos peludos", veterinaria.getNombre());

        LOG.info("Fin test datos completos");
    }

    @Test
    public void registrarMascota(){
        LOG.info("Inicio test agregar mascota");

        Veterinaria veterinaria = new Veterinaria("Amigos peludos");
        Mascota mascota = new Mascota("Praga","123456", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco", 10.2);
        Mascota mascota2 = new Mascota("Praga","1234567", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco", 10.2);
        Mascota mascota3 = new Mascota ("Macarena","12345678", "Gato", "Persa", (byte)66, "Femenino", "Gris", 100.1);
        Mascota mascota4 = new Mascota("Pamela", "12354789", "Gato", "Persa", (byte)18, "Femenino", "Rosado", 132.25);
        veterinaria.registrarMascota(mascota);
        veterinaria.registrarMascota(mascota2);
        veterinaria.registrarMascota(mascota3);
        veterinaria.registrarMascota(mascota4);

        LOG.info("Fin test agregar mascota");
    }

    @Test
    public void veterinariaNula(){
        LOG.info("Inicio test datos nulo");

        assertThrows(Throwable.class, () -> new Veterinaria(null));

        LOG.info("Fin test datos nulo");
    }
    
    @Test
    public void mascotaRepetida(){
        LOG.info("Inicio test mascota repetida");

        Veterinaria veterinaria = new Veterinaria("Amigos peludos");
        Mascota mascota = new Mascota("Praga","123456", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco", 10.2);
        Mascota mascota2 = new Mascota("Praga","123456", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco", 10.2);
        Mascota mascota3 = new Mascota ("Macarena","1234567", "Gato", "Persa", (byte)66, "Femenino", "Gris", 100.1);
        Mascota mascota4 = new Mascota("Pamela", "123547", "Gato", "Persa", (byte)18, "Femenino", "Rosado", 132.25);
        veterinaria.registrarMascota(mascota);
        veterinaria.registrarMascota(mascota2);
        veterinaria.registrarMascota(mascota3);
        veterinaria.registrarMascota(mascota4);

        LOG.info("Fin test mascota repetida");
    }

    @Test
    public void mascotasMayoresDe10() {
        List<Mascota> listaMascotas = new LinkedList<>();

        Mascota mascota = new Mascota("Praga","123456", "Perro", "Pomerania", (byte)3, "Femenino", "Blanco", 10.2);
        Mascota mascota2 = new Mascota ("Macarena","1234567", "Gato", "Persa", (byte)66, "Femenino", "Gris", 100.1);
        Mascota mascota3 = new Mascota("Pamela", "123547", "Gato", "Persa", (byte)18, "Femenino", "Rosado", 132.25);

        List<Mascota> mascotasTemporales = new LinkedList<>();
        mascotasTemporales.add(mascota);
        mascotasTemporales.add(mascota2);
        mascotasTemporales.add(mascota3);

        for (Mascota mascotaTemp : mascotasTemporales) {
            if (mascotaTemp.edad() > 10) {
                listaMascotas.add(mascotaTemp);
            }
        }
        System.out.println("Mascotas mayores de 10 años:");
        for (Mascota mascotaTemp : listaMascotas) {
            System.out.println("Nombre: " + mascotaTemp.nombre() + ", Edad: " + mascotaTemp.edad());
        }
    }
}



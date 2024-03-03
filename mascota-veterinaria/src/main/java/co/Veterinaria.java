package co;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;



public class Veterinaria {
    private final String nombre;
    private final Collection<Mascota> listaMascotas;


    public Veterinaria (String nombre){
        this.nombre = nombre;
        if (nombre == null) System.out.println("El nombre debe ser diferente de null");
        this.listaMascotas = new LinkedList <Mascota>();
       
    }


    public String getNombre(){
        return nombre;
    }

    public Collection<Mascota> getListaMascotas(){
        return Collections.unmodifiableCollection(listaMascotas);
    }

    public void registrarMascota(Mascota mascota){
        assert verificarId(mascota.Id()) == false : "Ya hay una mascota con ese número de identificación" + mascota.Id();
        listaMascotas.add(mascota);
    }
    
    private boolean verificarId (String Id){
        boolean yaexisteMascota = false;
        for (Mascota mascota : listaMascotas){
            if (mascota.Id().equals(Id)){
                yaexisteMascota = true;
            }
        }
        return yaexisteMascota;
    
}
}
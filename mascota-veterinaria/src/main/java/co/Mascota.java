package co;

import java.util.List;

public record Mascota(String nombre, String Id, String especie, String raza, byte edad, String genero, String color, double peso) {
        

    public Mascota {
        assert nombre != null && !nombre.isBlank() : "El nombre debe ser diferente de null y no puede haber un dato vacio";
        assert Id != null && !Id.isBlank(): "El número de identificación debe ser diferente de null";
        assert especie != null && !especie.isBlank() : "La especie debe ser diferente de null";
        assert raza != null && !raza.isBlank()   : "La raza debe ser diferente de null";
        assert edad > 0: "La edad debe ser mayor a cero";
        assert genero != null && !genero.isBlank() : "El genero debe ser diferente de null";
        assert color != null && !color.isBlank(): "El color debe ser diferente de null";
        assert peso > 0 : "El peso debe ser mayor a cero";
        assert edad <= 300;
        }


}


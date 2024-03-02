package co.edu.uniquindio.poo;

public record Mascota(String nombre, String especie, String raza, byte edad, String genero, String color, double peso) {
    
    public Mascota {
        assert nombre != null && !nombre.isBlank() : "El nombre debe ser diferente de null";
        assert especie != null && !especie.isBlank() : "La especie debe ser diferente de null";
        assert raza != null && !raza.isBlank()   : "La raza debe ser diferente de null";
        assert edad > 0 : "La edad debe ser mayor a cero";
        assert genero != null && !genero.isBlank() : "El genero debe ser diferente de null";
        assert color != null && !color.isBlank(): "El color debe ser diferente de null";
        assert peso > 0: "El peso debe ser mayor a cero";
       }
}

package co.edu.uniquindio.poo;

public record Mascota(String nombre, String especie, String raza, byte edad, String genero, String color, double peso) {
    public Mascota {
        if (edad > 30) {
            throw new IllegalArgumentException("La edad no puede ser mayor a 30 años");
        }
    }
}


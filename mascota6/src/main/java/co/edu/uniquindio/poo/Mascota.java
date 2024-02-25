package co.edu.uniquindio.poo;

public record Mascota(String nombre, String especie, String raza, byte edad, String genero, String color, double peso) {
    public Mascota {
        if (peso < 0 || peso > 100) {
            throw new IllegalArgumentException("El peso debe de estar entre 0 Kg y 100Kg");
        }
    }
}
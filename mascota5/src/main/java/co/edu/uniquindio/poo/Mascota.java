package co.edu.uniquindio.poo;

public record Mascota(String nombre, String especie, String raza, byte edad, String genero, String color, double peso) {
    public Mascota {
        if (!nombre.matches ("[a-zA-Z]+")) {
            throw new IllegalArgumentException("El nombre solo permite letras");
        }
    }
}

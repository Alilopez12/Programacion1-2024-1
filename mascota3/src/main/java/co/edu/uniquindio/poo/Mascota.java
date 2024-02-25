package co.edu.uniquindio.poo;

public record Mascota(String nombre, String especie, String raza, byte edad, String genero, String color, double peso) {

    public Mascota(String nombre, String especie, String raza, byte edad, String genero, String color, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        if(genero.equalsIgnoreCase("masculino") || genero.equalsIgnoreCase("femenino")) {
            this.genero = genero;
        } else {
            throw new IllegalArgumentException("El género debe ser 'masculino' o 'femenino'.");
        }
        this.color = color;
        this.peso = peso;
    }
}


package poo;

abstract class Persona {

    public Persona(String nom) {
        nombre = nom;
    }

    public String dameNombre() {
        return nombre;
    }

    private String nombre;

}

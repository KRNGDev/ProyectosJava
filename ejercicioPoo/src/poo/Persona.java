package poo;

abstract class Persona {

    public Persona(String nom) {
        nombre = nom;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String dameDescripcion();

    private String nombre;

}

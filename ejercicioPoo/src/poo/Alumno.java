package poo;

public class Alumno extends Persona {
    public Alumno(String nom, String car) {
        super(nom);

        carrera = car;
    }

    public String dameDescripcion() {
        return "La carrera de este alumno es " + carrera;
    }

    private String carrera;

}

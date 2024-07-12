package poo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Uso_Empleado {

    public static void main(String[] args) {

        Persona[] lasPersonas = new Persona[2];

        lasPersonas[0] = new Empleado("Pako", 50000, 2000, 11, 30);
        lasPersonas[1] = new Alumno("Lucia", "Economicas");

        for (Persona p : lasPersonas) {

            System.out.println(p.getNombre() + ", " + p.dameDescripcion());
        }

        Jefatura jefe_RRHH = new Jefatura("Piter", 20000, 2014, 02, 15);
        jefe_RRHH.estableceIncentivo(250);

        Empleado[] misEmpleados = new Empleado[4];

        misEmpleados[0] = new Empleado("Pako", 17000, 2024, 11, 15);
        misEmpleados[1] = new Empleado("Pepe", 17000, 2024, 11, 15);
        misEmpleados[2] = new Empleado("Maria", 17000, 2024, 11, 15);
        misEmpleados[3] = jefe_RRHH;

        Empleado director_comercial = new Jefatura("Nacho ALcaide", 120000, 2002, 1, 23);
        Comparable currito = new Empleado("Axel", 23000, 2016, 2, 29);

        System.out.println(jefe_RRHH.tomar_decisiones("Dar mas dias de vacaciones"));
        System.out.println("El jefe " + jefe_RRHH.getNombre() + " tiene un bonus de " + jefe_RRHH.establece_bonus(500));
        System.out.println("El empleado " + misEmpleados[2].getNombre() + " tiene un bonus de "
                + misEmpleados[2].establece_bonus(500));

        for (Empleado e : misEmpleados) {
            e.subeSueldo(6);
        }

        Arrays.sort(misEmpleados);

        for (Empleado e : misEmpleados) {
            System.out.println("Nombre: " + e.getNombre() + "\nSueldo: " + e.getSueldo() + "\nFecha contratacion: "
                    + e.getAltaContrato());
        }

        if (director_comercial instanceof Empleado) {
            System.out.println("Es de Tipo Jefatura");
        }
        if (currito instanceof Comparable) {
            System.out.println("Implementa la interfaz comprable");
        }

    }

}

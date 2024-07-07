package poo;

public class Uso_Empleado {

    public static void main(String[] args) {

        Jefatura jefe_RRHH = new Jefatura("Piter", 20000, 2014, 02, 15);
        jefe_RRHH.estableceIncentivo(250);

        Empleado[] misEmpleados = new Empleado[4];

        misEmpleados[0] = new Empleado("Pako", 17000, 2024, 11, 15);
        misEmpleados[1] = new Empleado("Pepe", 17000, 2024, 11, 15);
        misEmpleados[2] = new Empleado("Maria", 17000, 2024, 11, 15);
        misEmpleados[3] = jefe_RRHH;

        for (Empleado e : misEmpleados) {
            e.subeSueldo(6);
        }
        for (Empleado e : misEmpleados) {
            System.out.println("Nombre: " + e.getNombre() + "\nSueldo: " + e.getSueldo() + "\nFecha contratacion: "
                    + e.getAltaContrato());
        }

    }

}

package poo;

import java.util.*;

class Empleado extends Persona implements Comparable, Trabajadores {

    public Empleado(String nom, double sue, int year, int mes, int dia) {
        super(nom);
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(year, mes - 1, dia);
        altaContrato = calendario.getTime();

    }

    public double establece_bonus(double gratificacion) {

        return Trabajadores.bonus_base + gratificacion;
    }

    public String dameDescripcion() {
        return "Este empleado tiene un suldo  " + sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }

    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;

    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setAltaContrato(Date altaContrato) {
        this.altaContrato = altaContrato;
    }

    public int compareTo(Object miObjeto) {

        Empleado otroEmpleado = (Empleado) miObjeto;

        if (this.sueldo < otroEmpleado.sueldo) {

            return -1;
        }
        if (this.sueldo > otroEmpleado.sueldo) {
            return 1;

        }
        return 0;
    }

    private double sueldo;
    private Date altaContrato;

}

public class Jefatura extends Empleado implements Jefes {

    public Jefatura(String nom, double sue, int year, int mes, int dia) {
        super(nom, sue, year, mes, dia);
    }

    public void estableceIncentivo(double b) {

        incentivo = b;

    }

    public double establece_bonus(double gratificacion) {

        double prima = 2000;

        return Trabajadores.bonus_base + gratificacion + prima;
    }

    public double getSueldo() {

        double sueldoJefe = super.getSueldo();

        return sueldoJefe + incentivo;
    }

    public String tomar_decisiones(String decision) {
        return "Un miemebro de la direccion ha tomado la decision de : " + decision;

    }

    private double incentivo;

}

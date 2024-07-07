package poo;

import java.util.*;

class Empleado {

    public Empleado(double sue, int year, int mes, int dia) {

        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(year, mes - 1, dia);
        altaContrato = calendario.getTime();

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setAltaContrato(Date altaContrato) {
        this.altaContrato = altaContrato;
    }

    private double sueldo;
    private Date altaContrato;

}

public class Jefatura extends Empleado {

    public Jefatura(String nom, double sue, int year, int mes, int dia) {
        super(nom, sue, year, mes, dia);
    }

    public void estableceIncentivo(double b) {

        incentivo = b;

    }

    public double getSueldo() {

        double sueldoJefe = super.getSueldo();

        return sueldoJefe + incentivo;
    }

    private double incentivo;

}
package poo;

public class Vehiculo {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    private String color;

    public Vehiculo() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

}

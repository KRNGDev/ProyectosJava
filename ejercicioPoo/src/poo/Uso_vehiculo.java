package poo;

public class Uso_vehiculo {
    public static void main(String[] args) {
        Vehiculo miCoche1 = new Vehiculo();
        miCoche1.setColor("Azul");

        Furgoneta miForgoneta1 = new Furgoneta(4, 1000);

        miForgoneta1.setColor("Rojo");

        System.out.println(miForgoneta1.getDatosFurgoneta());

    }

}

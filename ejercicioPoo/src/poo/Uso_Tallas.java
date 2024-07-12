package poo;

import java.util.Scanner;

public class Uso_Tallas {

    enum Talla {
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

        private Talla(String abreviatura) {
            this.abreviatura = abreviatura;
        }

        public String dameAbreviatura() {
            return abreviatura;
        }

        private String abreviatura;

    };

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("escribe iuna tañña : MINI, MEDIANO, GRANDE, MUY_GRANDE");
        String entrada_datos = entrada.next().toUpperCase();

        Talla la_Talla = Enum.valueOf(Talla.class, entrada_datos);

        System.out.println("Talla=" + la_Talla);

        System.out.println("Abreviatura es = " + la_Talla.dameAbreviatura());
    }
}

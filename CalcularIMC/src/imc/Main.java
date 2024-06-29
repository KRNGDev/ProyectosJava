package imc;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos por teclado
        JOptionPane.showMessageDialog(null, "Introduce los datos para la persona 1:", "Informacion",
                JOptionPane.INFORMATION_MESSAGE);
        String nombre1 = JOptionPane.showInputDialog("Nombre: ");
        String texto = JOptionPane.showInputDialog("Edad: ");
        int edad1 = Integer.parseInt(texto);

        // scanner.nextLine(); // Consumir salto de línea

        String texto1 = JOptionPane.showInputDialog("Sexo (H/M): ");
        char sexo1 = texto1.charAt(0);
        String texto2 = JOptionPane.showInputDialog("Peso: ");
        double peso1 = Double.parseDouble(texto2);
        String texto3 = JOptionPane.showInputDialog("Altura: ");
        double altura1 = Double.parseDouble(texto3);

        // scanner.nextLine(); // Consumir salto de línea

        JOptionPane.showMessageDialog(null, "Introduce los datos para la persona 2:", "Informacion",
                JOptionPane.INFORMATION_MESSAGE);
        // System.out.print("Nombre: ");
        String nombre2 = JOptionPane.showInputDialog("Nombre: ");
        String texto4 = JOptionPane.showInputDialog("Edad: ");
        int edad2 = Integer.parseInt(texto4);

        // scanner.nextLine(); // Consumir salto de línea

        String texto5 = JOptionPane.showInputDialog("Sexo (H/M): ");
        char sexo2 = texto5.charAt(0);

        // Crear objetos de la clase Persona
        Persona persona1 = new Persona(nombre1, edad1, sexo1, peso1, altura1);
        Persona persona2 = new Persona(nombre2, edad2, sexo2);

        // Comprobar el estado de peso de cada persona
        int estadoPeso1 = persona1.calcularIMC();
        int estadoPeso2 = persona2.calcularIMC();

        // Mostrar información de cada persona
        JOptionPane.showMessageDialog(null,
                "Información de la persona 1:\n" + persona1.toString() + "\nEstado de peso: "
                        + obtenerEstadoPeso(estadoPeso1) + "\nEs mayor de edad: " + persona1.esMayorDeEdad(),
                "Informacion",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Información de la persona 2:\n" + persona2.toString() + "\nEstado de peso: "
                        + obtenerEstadoPeso(estadoPeso2) + "\nEs mayor de edad: " + persona2.esMayorDeEdad(),
                "Informacion",
                JOptionPane.INFORMATION_MESSAGE);

    }

    private static String obtenerEstadoPeso(int estado) {
        if (estado == -1) {
            return "Por debajo de su peso ideal";
        } else if (estado == 0) {
            return "En su peso ideal";
        } else {
            return "Con sobrepeso";
        }
    }
}

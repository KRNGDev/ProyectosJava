package poo;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Toolkit;
import java.util.Date;

public class PruebaTemporizador {

    public static void main(String[] args) {

        DameLaHora oyente = new DameLaHora();

        Timer mitemporizador = new Timer(5000, oyente);
        mitemporizador.start();
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
        System.exit(0);
    }
}

class DameLaHora implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Date ahora = new Date(0);
        System.out.println("Te pomgp la hora cada 5 segndos _ " + ahora);
        Toolkit.getDefaultToolkit().beep();

    }

}
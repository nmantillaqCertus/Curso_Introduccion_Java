package Sesion02;

import javax.swing.*;

public class E02 {
    public static void main( String[] algo) {

        String numeroAux = JOptionPane.showInputDialog("Ingresa un número de Iteraciones");

        String MensajeAux = JOptionPane.showInputDialog("Ingresa algún texto");


        Integer numeroIteraciones = Integer.parseInt(numeroAux);


        for (int certus = 0; certus< numeroIteraciones; certus++){
            System.out.println(MensajeAux);
            if (certus == 5){
                break;
            }
        }

    }
}

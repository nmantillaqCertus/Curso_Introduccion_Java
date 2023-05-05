package Sesion02;

import javax.swing.*;

public class E04 {
    public static void main( String[] algo) {

        String numeroAux = JOptionPane.showInputDialog("Ingresa un número de Iteraciones");

        String MensajeAux = JOptionPane.showInputDialog("Ingresa algún texto");


        Integer numeroIteraciones = Integer.parseInt(numeroAux);


        int certus = 0;
        do {
            System.out.println(MensajeAux);
            certus++;

            if (certus == 5){
                break;
            }
        }while (certus < numeroIteraciones);



        /*int certus = 0;
        while (certus< numeroIteraciones){
            System.out.println(MensajeAux);
            certus++;
            if (certus == 5){
                break;
            }
        }*/

        /*
        for (int certus = 0; certus< numeroIteraciones; certus++){
            System.out.println(MensajeAux);
            if (certus == 5){
                break;
            }
        }*/

    }
}

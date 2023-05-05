package Sesion02;

import javax.swing.*;

public class E01 {
    public static  void main(String[] arStrings){

        /*
        * Este es un programa para calcular la SUMA de dos numeros
        * El usuario ingresará el primero numero
        * Luego ingresará el segpundo numero despues de haberse validado el primero
        * */

        //Definición de VARIABLES
        String numeroUnoInicial;
        String numeroDosInicial;

        Double numeroUnoFinal =  null;
        Double numeroDosFinal = null;
        Double sumaNumero = null;

        try {
            numeroUnoInicial = JOptionPane.showInputDialog(null, "Ingrese el primer número válido");
            numeroUnoFinal = Double.parseDouble(numeroUnoInicial);

            numeroDosInicial = JOptionPane.showInputDialog(null, "Ingrese el segundo número válido");
            numeroDosFinal = Double.parseDouble(numeroDosInicial);

            sumaNumero = numeroUnoFinal + numeroDosFinal;

            JOptionPane.showMessageDialog(null, "La suma de los números ingresados es: "+sumaNumero);


        }catch (Exception cualquiervariable){

            System.out.println("El error es: "+cualquiervariable.getMessage());

            //IMmplementar tu error en la base de datos:  cualquiervariable.getMessage()

            main(arStrings);
            System.exit(0);
        }

        /*
            try{
                //hacer una serie de operaciones en la que tu creas, que se puede caer tu aplicación
            }catch (Exception e){
                //Operaciones para controlar los errores
            }
        */

        System.out.println("El valor recibido es: "+numeroUnoFinal);





    }



}

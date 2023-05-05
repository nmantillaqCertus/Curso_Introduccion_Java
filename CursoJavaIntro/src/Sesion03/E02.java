package Sesion03;

import java.util.Arrays;

public class E02 {
    public static  void main(String[] arStrings){

        //Arreglos cadenas

        String [] arregloEjemplo = new String[5];
        arregloEjemplo[0] = "Hola";
        arregloEjemplo[1] = "Como";
        arregloEjemplo[2] = "Estas";
        arregloEjemplo[3] = "123 Hola";
        arregloEjemplo[4] = "## 123 Hola";
        Arrays.sort(arregloEjemplo);

        for (int i=0; i< arregloEjemplo.length; i++){
            System.out.println("Segundo elemento: "+arregloEjemplo[i]);
        }


    }
}

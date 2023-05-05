package Sesion03;

import java.util.Arrays;

public class E01 {
    public static  void main(String[] arStrings){

        //Arreglos Enteros

        int [] arregloEjemplo = new int[3];
        arregloEjemplo[0] = 20;
        arregloEjemplo[1] = 9;
        arregloEjemplo[2] = 89;
        Arrays.sort(arregloEjemplo);

        for (int i=0; i< arregloEjemplo.length; i++){
            System.out.println("Segundo elemento: "+arregloEjemplo[i]);
        }


    }
}

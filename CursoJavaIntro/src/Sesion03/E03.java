package Sesion03;

import java.util.Arrays;

public class E03 {
    public static  void main(String[] arStrings){

        //Arreglos Enteros

        int [][] arregloEjemplo = new int[3][4];
        arregloEjemplo[0][0] = 20;
        arregloEjemplo[0][1] = 34;
        arregloEjemplo[0][2] = 56;
        arregloEjemplo[0][3] = 67;

        arregloEjemplo[1][0] = 42;
        arregloEjemplo[1][1] = 64;
        arregloEjemplo[1][2] = 87;
        arregloEjemplo[1][3] = 93;

        arregloEjemplo[2][0] = 45;
        arregloEjemplo[2][1] = 15;
        arregloEjemplo[2][2] = 18;
        arregloEjemplo[2][3] = 30;


        //System.out.println("Elemento "+arregloEjemplo[2][3]);

        for (int f=0; f< arregloEjemplo.length; f++){

            for (int c=0; c< arregloEjemplo[f].length; c++){
                System.out.print("Elemento "+arregloEjemplo[f][c]+" \t");
            }
            System.out.println();
            //System.out.println("Elemento "+(i+1)+" :"+arregloEjemplo[i]);
        }


    }
}

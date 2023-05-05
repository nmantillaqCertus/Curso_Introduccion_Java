package Sesion02;

import javax.swing.*;
import java.util.*;

public class E06 {
    public static void main( String[] claseCertus) {

        //1.- Pedir al usuarios, cuantos nombres desea ingresar
        String numeroAux;
        Integer numeroAuxFinal;
        String nombreRecibido;

        //Definiendo el listado de nombres
        ArrayList<String> listaNombres = new ArrayList<>();

        try {
            numeroAux = JOptionPane.showInputDialog(null, "Ingrese el número de cantidad de nombres a ingresar");
            numeroAuxFinal = Integer.parseInt(numeroAux);

            //2.- Pedir al usuarios la cantidad de nombres indicados
            for (int i=0; i<numeroAuxFinal; i++){
                nombreRecibido = JOptionPane.showInputDialog(null, "Ingresa un nombre");
                listaNombres.add(nombreRecibido);
            }

            for (int v=0; v < listaNombres.size(); v++){
                System.out.println("Nombre: "+listaNombres.get(v));
            }

        }catch (Exception cualquiervariable){
            System.out.println("El error es: "+cualquiervariable.getMessage());
            main(claseCertus);
            System.exit(0);
        }


    }
}
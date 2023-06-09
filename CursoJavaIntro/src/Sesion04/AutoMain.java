package Sesion04;

import java.util.ArrayList;
import java.util.List;

public class AutoMain {

    public static  void main(String[] arStrings){

        solicitudes solicitudServicio =  new solicitudes();
        Auto autito =  new Auto();
        autito.setNombre("Nombre Demo");

        System.out.println("Nombre Demo Encapsulamiento: "+autito.getNombre());


        ArrayList<Auto> listadoAutos = new ArrayList<>();
        listadoAutos.add(autito);

        Cliente clientito = new Cliente();

        //Creando el cliente
        clientito.setNombre("Fulanito");

        //Creando el auto
        autito.setNombre("AUTO DEMO 2024");


        //Creando la solicitud de servicio
        solicitudServicio.setNombreSolictud("Lavado fin de mes");
        solicitudServicio.setAutoLavdo(listadoAutos);
        solicitudServicio.setClienteLavado(clientito);


        //Double combustibleGastado = autito.calculoKM(12, 100);



        System.out.println("Nombre de cliente de la solicitud: "+solicitudServicio.getClienteLavado().getNombre());





    }
}

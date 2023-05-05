package Sesion01;

public class E01 {

    public static  void main(String[] arStrings){

        String saludo = "Procesar Venta";

        System.out.println( saludo.toUpperCase());

        /*
        * Elaborar un Algoritmo para calcular el área de cualquier triángulo rectángulo
        * y presentar el resultado en pantalla.
        * */

        //Definir variables
        //TIPO_DATO  nombreVariable

        Double altura;
        Double area;
        double base;

        //Inicializar las variables
        altura = 15.0;
        base = 20.0;

        //Definir operacion
        area = (base*altura)/2;

        if(area >= 200){
            System.out.println("El triangulo es grande y su área es "+area);
        }else if(area > 100){
            System.out.println("El triangulo es mediano y su área es "+area);
        }else {
            System.out.println("El triangulo es pequeño y su área es "+area);
        }

        /*
        if(area >= 200){
            System.out.println("El triangulo es grande y su área es "+area);
        }else {
            System.out.println("El triangulo es pequeño y su área es "+area);
        }
        */


    }

}

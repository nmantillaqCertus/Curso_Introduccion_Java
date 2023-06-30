package Sesion06;

import Sesion06.Entidades.Producto;
import Sesion06.Entidades.ResponseCliente;
import Sesion06.Entidades.Usuario;
import Sesion06.Repositorio.AutenticarImplements;
import Sesion06.Repositorio.ClienteImplements;
import Sesion06.Repositorio.ProductoImplements;

import javax.swing.*;
import java.util.ArrayList;

public class Aplicacion_Ventas {

    public static  void main(String[] args){

        ProductoImplements productos = new ProductoImplements();

        //Cliente Autenticado
        AutenticarImplements nuevoIngreso = new AutenticarImplements();
        Usuario usuario = new Usuario();


        String usuarioNuevo = JOptionPane.showInputDialog("Ingrese su usuario");
        String contraseniaNueva = JOptionPane.showInputDialog("Ingrese su contraseña");
        usuario.setUsuario(usuarioNuevo);
        usuario.setPassword(contraseniaNueva);

        nuevoIngreso.autentica( usuario);
        ResponseCliente respueta = nuevoIngreso.autentica( usuario);

        if (respueta.isExiste() && respueta.isDatosCorrectos()){

            System.out.println("El cliente es: "+respueta.getCliente().getNombres());
            var listaproductos = productos.listarProductos();



            ArrayList<String> codigos = new ArrayList<>();
            for ( Producto productito : listaproductos ) {
                System.out.println("Nombre del producto: "+productito.getNombre());
                codigos.add(productito.getCod_Producto().toString());
            }

            //Cliente Elegir Productos

            String codProductoElegido = JOptionPane.showInputDialog("Ingrese su usuario");

            var ListaProductosComprado = productos.procesarProductos(codigos);

            //Cliente Elige Comprobante

            //Cliente Realiza Pago

            //Cliente visualizará su Comprobante con el detalle de sus productos y costo total


        }else {
            if (!respueta.isExiste()){
                System.out.println("El cliente no existe");
            }
            if (!respueta.isDatosCorrectos()){
                System.out.println("Usuario o contraseña incorrectos");
            }
        }
    }
}

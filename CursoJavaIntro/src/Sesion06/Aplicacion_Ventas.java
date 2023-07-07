package Sesion06;

import Sesion06.Entidades.*;
import Sesion06.Repositorio.AutenticarImplements;
import Sesion06.Repositorio.ClienteImplements;
import Sesion06.Repositorio.ComprobanteImplements;
import Sesion06.Repositorio.ProductoImplements;

import javax.swing.*;
import java.util.ArrayList;

public class Aplicacion_Ventas {

    public static  void main(String[] args){

        ProductoImplements productos = new ProductoImplements();
        ComprobanteImplements comprobante = new ComprobanteImplements();

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



            var productosCadena = "";
            for ( Producto productito : listaproductos ) {
                productosCadena += productito.getCod_Producto()+" - "+ productito.getNombre()+"\n";
            }
            //Cliente Elegir Productos
            String codProductoElegido = JOptionPane.showInputDialog("Estimado cliente, elija al menos un producto: \n"+productosCadena);


            //Cliente Elige Comprobante
            String productosConMontos = "";
            Double productosCostoTotal = 0.0;
            ArrayList<Producto> ListaProductosComprado = (ArrayList<Producto>) productos.procesarProductos(codProductoElegido);
            for (Producto producto : ListaProductosComprado) {
                productosConMontos += producto.getNombre()+"\t        "+ producto.getPrecio_Unitario()+"\n";
                productosCostoTotal += producto.getPrecio_Unitario();
            }
            productosConMontos += "\n Total a Pagar: "+productosCostoTotal;
            productosConMontos += "\n\n Elija el tipo de comprobante: \n 1) Boleta \n 2) Factura";



            String tipoComprobante = JOptionPane.showInputDialog("Estimado cliente, a continuación se muestra los productos a pagar: \n"+productosConMontos);
            //Fin Cliente Elige Comprobante

            Factura FacturaGenerada = null;
            Boleta BoletaGenerada = null;

            if (tipoComprobante == "1"){ //Boleta
                //Cliente Realiza Pago
                String TipoPagoBoleta = JOptionPane.showInputDialog("Estimado cliente, elija el tipo de pago: \n  1) Efectivo \n 2) Tarjeta");

                BoletaGenerada = comprobante.generarBoleta(ListaProductosComprado, respueta.getCliente(), TipoPagoBoleta);
            }

            if (tipoComprobante == "2"){ //Factura
                //Cliente Realiza Pago
                String TipoPagoFactura = JOptionPane.showInputDialog("Estimado cliente, elija el tipo de pago: \n  1) Efectivo \n 2) Tarjeta");

                FacturaGenerada = comprobante.generarFactura(ListaProductosComprado, respueta.getCliente(), TipoPagoFactura);
            }

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

package Sesion06.Repositorio;

import Sesion06.Entidades.Boleta;
import Sesion06.Entidades.Cliente;
import Sesion06.Entidades.Factura;
import Sesion06.Entidades.Producto;
import Sesion06.Interfaces.IComprobante;

import java.util.ArrayList;

public class ComprobanteImplements implements IComprobante {
    @Override
    public Factura generarFactura(ArrayList<Producto> ListaProducto, Cliente clientito, String tipoPago) {
        Factura facturita = new Factura();

        //Procesamiento

        if (tipoPago == "1"){
            facturita.setMetodo_Pago("Efectivo");
        } else if (tipoPago == "2") {
            facturita.setMetodo_Pago("Tarjeta");
        }

        return facturita;
    }

    @Override
    public Boleta generarBoleta(ArrayList<Producto> ListaProducto, Cliente clientito, String tipoPago) {
        Boleta boletita = new Boleta();

        //Procesamiento

        if (tipoPago == "1"){
            boletita.setMetodo_Pago("Efectivo");
        } else if (tipoPago == "2") {
            boletita.setMetodo_Pago("Tarjeta");
        }

        return boletita;
    }
}

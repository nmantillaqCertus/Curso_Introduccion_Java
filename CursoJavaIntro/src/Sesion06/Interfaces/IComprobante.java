package Sesion06.Interfaces;

import Sesion06.Entidades.*;

import java.util.ArrayList;

public interface IComprobante {
    Factura generarFactura (ArrayList<Producto> ListaProducto, Cliente clienttito, String tipoPago);

    Boleta generarBoleta (ArrayList<Producto> ListaProducto, Cliente clienttito, String tipoPago);
}

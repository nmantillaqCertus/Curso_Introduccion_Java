package Sesion06.Interfaces;

import Sesion06.Entidades.Producto;

import java.util.ArrayList;
import java.util.List;

public interface IProducto {
    public List<Producto> listarProductos();

    public List<Producto> procesarProductos(ArrayList<String> codigos );
}

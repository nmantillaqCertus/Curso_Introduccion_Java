package Sesion06.Repositorio;

import Sesion06.Entidades.Producto;
import Sesion06.Interfaces.IProducto;

import java.util.ArrayList;
import java.util.List;

public class ProductoImplements implements IProducto {
    @Override
    public List<Producto> listarProductos() {

        Producto productito = new Producto();

        ArrayList<Producto> ListaProductos = new ArrayList<>();
        productito.setCod_Producto(456);
        productito.setNombre("Cocina");
        productito.setPrecio_Unitario(1500.0);
        productito.setStock(50);
        productito.setCod_Categoria(1);
        productito.setNombreCategoria("Electrodomésticos");


        ListaProductos.add(productito);

        return ListaProductos;
    }
}

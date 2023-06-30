package Sesion06.Repositorio;

import Sesion06.Entidades.Producto;
import Sesion06.Interfaces.IProducto;

import java.util.ArrayList;
import java.util.List;

public class ProductoImplements implements IProducto {

    ArrayList<Producto> ListaProductos = new ArrayList<>();

    @Override
    public List<Producto> listarProductos() {

        Producto productito = new Producto();

        productito.setCod_Producto(456);
        productito.setNombre("Cocina");
        productito.setPrecio_Unitario(1500.0);
        productito.setStock(50);
        productito.setCod_Categoria(1);
        productito.setNombreCategoria("Electrodomésticos");
        ListaProductos.add(productito);

        Producto productito2 = new Producto();
        productito2.setCod_Producto(457);
        productito2.setNombre("Refrigeradora");
        productito2.setPrecio_Unitario(2500.0);
        productito2.setStock(10);
        productito2.setCod_Categoria(1);
        productito2.setNombreCategoria("Electrodomésticos");
        ListaProductos.add(productito2);

        return ListaProductos;
    }

    @Override
    public List<Producto> procesarProductos( ArrayList<String> codigos ) {
        ArrayList<Producto> ProductosComprados = new ArrayList<>();

        for (int i=0; i< codigos.size(); i++){
            // busqueda del codigfo del producto comprado en la lista de produtos disponibles
        }

        //ListaProductos

        return ProductosComprados;
    }
}

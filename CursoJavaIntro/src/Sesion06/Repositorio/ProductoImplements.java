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

        Producto productito3 = new Producto();
        productito3.setCod_Producto(458);
        productito3.setNombre("Televisor");
        productito3.setPrecio_Unitario(2500.0);
        productito3.setStock(10);
        productito3.setCod_Categoria(1);
        productito3.setNombreCategoria("Tecnología");
        ListaProductos.add(productito3);

        Producto productito4 = new Producto();
        productito4.setCod_Producto(459);
        productito4.setNombre("Computadora");
        productito4.setPrecio_Unitario(7500.0);
        productito4.setStock(10);
        productito4.setCod_Categoria(1);
        productito4.setNombreCategoria("Tecnología");
        ListaProductos.add(productito4);

        Producto productito5 = new Producto();
        productito5.setCod_Producto(460);
        productito5.setNombre("Edredon");
        productito5.setPrecio_Unitario(250.0);
        productito5.setStock(10);
        productito5.setCod_Categoria(1);
        productito5.setNombreCategoria("Textil");
        ListaProductos.add(productito5);

        return ListaProductos;
    }

    @Override
    public List<Producto> procesarProductos( String codigos ) {
        ArrayList<Producto> ProductosComprados = new ArrayList<>();

        String [] listaCodigos = codigos.split(";");
        for (String codigo : listaCodigos) {
            for (Producto p : ListaProductos) {
                if (p.getCod_Producto() == Integer.parseInt(codigo)){
                    ProductosComprados.add(p);
                }
            }
        }
        return ProductosComprados;
    }
}

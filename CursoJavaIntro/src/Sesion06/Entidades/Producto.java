package Sesion06.Entidades;

public class Producto extends  Categoria{
    private Integer cod_Producto;
    private String nombre;
    private Double precio_Unitario;
    private Integer stock;

    public Integer getCod_Producto() {
        return cod_Producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCod_Producto(Integer cod_Producto) {
        this.cod_Producto = cod_Producto;
    }

    public Double getPrecio_Unitario() {
        return precio_Unitario;
    }

    public void setPrecio_Unitario(Double precio_Unitario) {
        this.precio_Unitario = precio_Unitario;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}

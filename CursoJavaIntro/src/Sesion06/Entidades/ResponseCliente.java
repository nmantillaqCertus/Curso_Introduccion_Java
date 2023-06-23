package Sesion06.Entidades;

public class ResponseCliente {
    private Cliente cliente;
    private  boolean existe;
    private  boolean datosCorrectos;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public boolean isDatosCorrectos() {
        return datosCorrectos;
    }

    public void setDatosCorrectos(boolean datosCorrectos) {
        this.datosCorrectos = datosCorrectos;
    }
}

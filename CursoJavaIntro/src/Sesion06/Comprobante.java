package Sesion06;

public class Comprobante extends Empresa{
    private Vendedor vendedor;
    private Cliente cliente;
    private String cod_Comprobante;
    private String tipo;

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCod_Comprobante() {
        return cod_Comprobante;
    }

    public void setCod_Comprobante(String cod_Comprobante) {
        this.cod_Comprobante = cod_Comprobante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

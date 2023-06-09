package Sesion06.Entidades;

public class Factura extends Comprobante{
    private Double monto_Neto;
    private Double monto_Total;
    private Double IGV;
    private String metodo_Pago;
    private Detalle_Compras detalleCompras;

    public Double getMonto_Neto() {
        return monto_Neto;
    }

    public void setMonto_Neto(Double monto_Neto) {
        this.monto_Neto = monto_Neto;
    }

    public Double getMonto_Total() {
        return monto_Total;
    }

    public void setMonto_Total(Double monto_Total) {
        this.monto_Total = monto_Total;
    }

    public Double getIGV() {
        return IGV;
    }

    public void setIGV(Double IGV) {
        this.IGV = IGV;
    }

    public String getMetodo_Pago() {
        return metodo_Pago;
    }

    public void setMetodo_Pago(String metodo_Pago) {
        this.metodo_Pago = metodo_Pago;
    }

    public Detalle_Compras getDetalleCompras() {
        return detalleCompras;
    }

    public void setDetalleCompras(Detalle_Compras detalleCompras) {
        this.detalleCompras = detalleCompras;
    }
}

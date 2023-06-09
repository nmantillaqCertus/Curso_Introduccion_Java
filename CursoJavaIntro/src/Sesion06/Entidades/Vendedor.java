package Sesion06.Entidades;

public class Vendedor extends Persona{
    private  Integer cod_Vendedor;
    private  Integer cod_Caja;

    public Integer getCod_Vendedor() {
        return cod_Vendedor;
    }

    public void setCod_Vendedor(Integer cod_Vendedor) {
        this.cod_Vendedor = cod_Vendedor;
    }

    public Integer getCod_Caja() {
        return cod_Caja;
    }

    public void setCod_Caja(Integer cod_Caja) {
        this.cod_Caja = cod_Caja;
    }
}

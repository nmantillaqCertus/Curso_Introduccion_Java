package Sesion06.Entidades;

public class Cliente extends Persona {

    private Integer cod_Cliente;
    private Integer RUC;
    private String ocupacion;

    public Integer getCod_Cliente() {
        return cod_Cliente;
    }

    public void setCod_Cliente(Integer cod_Cliente) {
        this.cod_Cliente = cod_Cliente;
    }

    public Integer getRUC() {
        return RUC;
    }

    public void setRUC(Integer RUC) {
        this.RUC = RUC;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}

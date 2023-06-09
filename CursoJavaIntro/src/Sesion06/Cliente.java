package Sesion06;

public class Cliente extends Persona {
    private Integer RUC;
    private String ocupacion;

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

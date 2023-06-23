package Sesion06.Entidades;
import java.lang.Long;
public class Cliente extends Persona {

    private Integer cod_Cliente;
    private String RUC;
    private String ocupacion;
    private Usuario usuario;

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getCod_Cliente() {
        return cod_Cliente;
    }

    public void setCod_Cliente(Integer cod_Cliente) {
        this.cod_Cliente = cod_Cliente;
    }


    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}

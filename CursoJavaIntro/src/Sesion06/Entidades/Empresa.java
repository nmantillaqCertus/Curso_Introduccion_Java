package Sesion06.Entidades;

public class Empresa {
    private Integer cod_Empresa;
    private  String razon_Social;
    private  Integer RUC;
    private  String direccion;
    private  Integer nro_Empleados;

    public Integer getCod_Empresa() {
        return cod_Empresa;
    }

    public void setCod_Empresa(Integer cod_Empresa) {
        this.cod_Empresa = cod_Empresa;
    }

    public String getRazon_Social() {
        return razon_Social;
    }

    public void setRazon_Social(String razon_Social) {
        this.razon_Social = razon_Social;
    }

    public Integer getRUC() {
        return RUC;
    }

    public void setRUC(Integer RUC) {
        this.RUC = RUC;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getNro_Empleados() {
        return nro_Empleados;
    }

    public void setNro_Empleados(Integer nro_Empleados) {
        this.nro_Empleados = nro_Empleados;
    }
}

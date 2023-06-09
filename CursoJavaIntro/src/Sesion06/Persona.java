package Sesion06;

public class Persona {
    private Integer cod_Persona;
    private  String nombres;
    private  String apellidos;
    private  Integer edad;
    private  String direccion;
    private  Integer DNI;

    public Integer getCod_Persona() {
        return cod_Persona;
    }

    public void setCod_Persona(Integer cod_Persona) {
        this.cod_Persona = cod_Persona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }
}

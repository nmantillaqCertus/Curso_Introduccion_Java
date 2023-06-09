package Sesion04;

public class Auto {
    private String nombre;
    private String color;
    private String marca;
    private Integer anioFabricacion;
    private Double kilometraje;
    private Double capacidad; //litros
    private Double combustible; //combustible gastado en litros

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }

    public Double getCombustible() {
        return combustible;
    }

    public void setCombustible(Double combustible) {
        this.combustible = combustible;
    }

    // (LITROS CONSUMIDOS / KM RECORRIDOS) X 100
    public static Double calculoKM(int distancia, double comGastado){
        Double combGastadoFinal = (comGastado/distancia)*100;
        return  combGastadoFinal;
    }
}

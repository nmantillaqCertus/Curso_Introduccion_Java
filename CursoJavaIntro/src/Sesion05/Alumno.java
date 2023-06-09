package Sesion05;

import java.util.List;

public class Alumno extends Persona{

    private  Integer ciclo;
    private String carrera;
    private Integer codAlumno;
    private List<Curso> cursos;


    public Alumno(){
    }
    public Alumno(String carrera){
        this.carrera =  carrera;
    }
    public Alumno(Integer ciclo, String carrera, Integer codAlumno){
        this.ciclo =  ciclo;
        this.carrera =  carrera;
        this.codAlumno =  codAlumno;
    }

    @Override
    public  String nombreCompletos(){
        return super.nombreCompletos()+" | COD: "+this.codAlumno;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(Integer codAlumno) {
        this.codAlumno = codAlumno;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}

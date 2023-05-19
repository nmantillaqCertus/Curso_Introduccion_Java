package Sesion05;

import java.util.ArrayList;

public class Estudiantes2023 {
    public static  void main(String[] arStrings){

        IAlumnoImplement alumno =  new IAlumnoImplement();

        Alumno alumnito = new Alumno();
        alumnito.setNombres("Certus");

        ArrayList<Curso> cursitos =  new ArrayList<>();
        Curso cursito = new Curso();
        cursito.setNombre("Desarrollo y Soporte");
        cursito.setPromedio(15);
        cursito.setCredito(3);

        cursitos.add(cursito);

        String respuesta = alumno.crearAlumno(alumnito, cursitos);

        System.out.println("Respuesta: "+respuesta);


    }
}

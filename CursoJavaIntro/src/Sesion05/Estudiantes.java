package Sesion05;

import java.util.ArrayList;
import java.util.List;

public class Estudiantes {
    public static  void main(String[] arStrings){

        Persona personita = new Persona();
        Alumno alumnito = new Alumno(3,"Ingeniería de Software",555999);

        alumnito.setNombres("Fulanito");
        alumnito.setApellidos("Gonzales Prada de las Casas");
        //alumnito.setCiclo(5);
        alumnito.setEdad(20);
        //alumnito.setCodAlumno(789456);
        alumnito.setGenero('M');

        personita.setNombres("Alex");
        personita.setApellidos("Paredes Barriga");

        String datosCompletos = personita.nombreCompletos();
        System.out.println(datosCompletos);

        ArrayList<Curso> cursitos = new ArrayList<>();

        Curso cursito1 = new Curso();
        cursito1.setNombre("Algoritmos");
        cursito1.setPromedio(20);
        cursito1.setCredito(5);

        Curso cursito2 = new Curso();
        cursito2.setNombre("Herramientas Digitales");
        cursito2.setPromedio(15);
        cursito2.setCredito(3);

        cursitos.add(cursito1);
        cursitos.add(cursito2);

        alumnito.setCursos(cursitos);
        alumnito.setCodAlumno(123456789);

        System.out.println("Nombre Alumno :"+alumnito.getNombres()+" y carrera: "+alumnito.getCarrera()+" Ciclo: "+alumnito.getCiclo());

        System.out.println("Lista de curso del alumno "+alumnito.getNombres());

        for (Curso c: alumnito.getCursos()) {
            System.out.println("> "+c.getNombre());
            System.out.println("> "+c.getCredito());
            System.out.println("> "+c.getPromedio());

        }


        IAlumnoImplement alumnoImpl = new IAlumnoImplement();

        String respuesta = alumnoImpl.crearAlumno(alumnito,cursitos);

        System.out.println("respuesta: "+respuesta);

    }
}

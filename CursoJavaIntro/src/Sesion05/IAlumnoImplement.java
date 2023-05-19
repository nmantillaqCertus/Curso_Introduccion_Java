package Sesion05;

import java.util.List;

public class IAlumnoImplement implements IAlumno{

    @Override
    public String crearAlumno(Alumno alumno, List<Curso> cursos) {

        String nombreAlumno = alumno.getNombres();
        String primerCurso = "";
        if (cursos.size()>0){
            primerCurso = " Cursos como: "+cursos.get(0).getNombre();
        }

        return "Alumno creado: "+nombreAlumno+" con : "+cursos.size()+ primerCurso;
    }
}

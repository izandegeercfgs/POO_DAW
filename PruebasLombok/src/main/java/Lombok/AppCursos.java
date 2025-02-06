package Lombok;

public class AppCursos {
    public static void main(String[] args) {
        Instituto instituto = new Instituto("IES MUTXAMEL");

        // se crean los cursos
        Curso cursoJava = new Curso("Java", 100);
        Curso cursoPython = new Curso("Python", 70);
        instituto.agregarCurso(cursoJava);
        instituto.agregarCurso(cursoPython);

        // se crean los estudiantes
        try {
            Estudiante estudiante1 = new Estudiante("Carlos", 20, cursoJava);
            Estudiante estudiante2 = new Estudiante("Ana", 22, cursoPython);
            instituto.agregarEstudiante(estudiante1);
            instituto.agregarEstudiante(estudiante2);

            // se va a probar a crear un estudiante con nombre nulo
            Estudiante estudianteErroneo = new Estudiante(null, 0, cursoJava);
        } catch (NullPointerException e) {
            System.out.println("Error: No se puede crear un estudiante con nombre nulo.");
        }

        // se va a intentar añadir un estudiante nulo
        instituto.agregarEstudiante(null);

        // se intenta añadir un curso nulo
        instituto.agregarCurso(null);

        // se muestran los cursos
        System.out.println("Cursos disponibles:");
        System.out.println(instituto.getListaCursos());

        // se muestran los estudiantes
        System.out.println("Estudiantes registrados:");
        System.out.println(instituto.getListaEstudiantes());
    }
}

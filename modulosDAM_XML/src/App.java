import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<HashMap<String, String>> cursos = new ArrayList<>();

    public static String nombreAlumno() {
        String nombre;
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("Su nombre es " + nombre);
        return nombre;
    }

    public static void anadirDatos() {
        HashMap<String, String> materia = new HashMap<>();

        materia.put("Nombre", "Sistemas informáticos");
        materia.put("Codigo", "0483");
        materia.put("horas", "170");
        materia.put("Curso", "DAM1");

        cursos.add(materia);
        materia = new HashMap<>();
        materia.put("Nombre", "Bases de datos");
        materia.put("Codigo", "0484");
        materia.put("horas", "170");
        materia.put("Curso", "DAM1");

        cursos.add(materia);

        materia = new HashMap<>();
        materia.put("Nombre", "Programación");
        materia.put("Codigo", "0485");
        materia.put("horas", "230");
        materia.put("Curso", "DAM1");

        cursos.add(materia);

        materia = new HashMap<>();
        materia.put("Nombre", "Lenguaje de marcas y sistemas de gestion de información");
        materia.put("Codigo", "0373");
        materia.put("horas", "120");
        materia.put("Curso", "DAM1");

        cursos.add(materia);

        materia = new HashMap<>();
        materia.put("Nombre", "Entornos de desarrollo");
        materia.put("Codigo", "0487");
        materia.put("horas", "90");
        materia.put("Curso", "DAM1");

        cursos.add(materia);

        materia = new HashMap<>();
        materia.put("Nombre", "Formación y orientacion laboral");
        materia.put("Codigo", "0493");
        materia.put("horas", "90");
        materia.put("Curso", "DAM1");

        /**
         * Materias de segundo
         */
        cursos.add(materia);

        materia = new HashMap<>();
        materia.put("Nombre", "Acceso a datos");
        materia.put("Codigo", "0486");
        materia.put("horas", "125");
        materia.put("Curso", "DAM2");

        cursos.add(materia);

        materia = new HashMap<>();
        materia.put("Nombre", "Desarrollo de interfacess");
        materia.put("Codigo", "0488");
        materia.put("horas", "125");
        materia.put("Curso", "DAM2");

        cursos.add(materia);
        materia = new HashMap<>();
        materia.put("Nombre", "Programación multimedia y dispositivos móviles");
        materia.put("Codigo", "0489");
        materia.put("horas", "85");
        materia.put("Curso", "DAM2");

        cursos.add(materia);
        materia = new HashMap<>();
        materia.put("Nombre", "Programación de servicios y procesos");
        materia.put("Codigo", "0490");
        materia.put("horas", "70");
        materia.put("Curso", "DAM2");

        cursos.add(materia);
        materia = new HashMap<>();
        materia.put("Nombre", "Sistemas de gestión empresarial");
        materia.put("Codigo", "0491");
        materia.put("horas", "95");
        materia.put("Curso", "DAM2");

        cursos.add(materia);
        materia = new HashMap<>();
        materia.put("Nombre", "Proyecto de desarrollo de aplicaciones multiplataforma");
        materia.put("Codigo", "0492");
        materia.put("horas", "40");
        materia.put("Curso", "DAM2");

        cursos.add(materia);
        materia = new HashMap<>();
        materia.put("Nombre", "Empresa e iniciativa emprendedora");
        materia.put("Codigo", "0494");
        materia.put("horas", "60");
        materia.put("Curso", "DAM2");

        cursos.add(materia);
        materia = new HashMap<>();
        materia.put("Nombre", "Formación en centros de trabajo");
        materia.put("Codigo", "0495");
        materia.put("horas", "400");
        materia.put("Curso", "DAM2");
    }

    
    public static void main(String[] args) throws Exception {
        anadirDatos();

        for (HashMap<String, String> string : cursos) {
            System.out.println(string);
        }
    }
}

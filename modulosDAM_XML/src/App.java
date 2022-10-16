import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import org.w3c.dom.Attr;

public class App {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<HashMap<String, String>> cursos = new ArrayList<>();

    // public static final String filepath = System.getProperty("user.dir") +
    // System.getProperty("file.separator")
    // + "Prueba11.txt";
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
        materia.put("Nombre", "Formacion y orientacion laboral");
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
        materia.put("Nombre", "Desarrollo de interfaces");
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
        materia.put("Nombre", "Formacion en centros de trabajo");
        materia.put("Codigo", "0495");
        materia.put("horas", "400");
        materia.put("Curso", "DAM2");
        cursos.add(materia);
    }

    public static void createXML(ArrayList<String> materias, String filepath) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            document.setXmlVersion("1.1");

            Element root = document.createElement("cicle");
            document.appendChild(root);

            Attr codi = document.createAttribute("codi");
            codi.setValue("IFC32");
            root.setAttributeNode(codi);

            Attr tipus = document.createAttribute("tipus");
            tipus.setValue("CFGS");
            root.setAttributeNode(tipus);

            Attr sigles = document.createAttribute("sigles");
            sigles.setValue("DAM");
            root.setAttributeNode(sigles);

            Attr nom = document.createAttribute("nom");
            nom.setValue("Desarrollo de aplicaciones multiplataforma");
            root.setAttributeNode(nom);

            for (int i = 0; i < materias.size(); i++) {
                for (int j = 0; j < cursos.size(); j++) {

                    if (materias.get(i).equalsIgnoreCase(cursos.get(j).get("Nombre"))) {
                        System.out.println(materias.get(i));
                        Element modul = document.createElement("modul");
                        root.appendChild(modul);

                        Attr curs = document.createAttribute("curs");
                        curs.setValue(cursos.get(j).get("Curso"));
                        modul.setAttributeNode(curs);

                        Attr codigo = document.createAttribute("codi");
                        codigo.setValue(cursos.get(j).get("Codigo"));
                        modul.setAttributeNode(codigo);

                        Element nombre = document.createElement("nom");
                        nombre.appendChild(document.createTextNode(cursos.get(j).get("Nombre")));
                        modul.appendChild(nombre);

                        Element hores = document.createElement("nombreHores");
                        hores.appendChild(document.createTextNode(cursos.get(j).get("horas")));
                        modul.appendChild(hores);

                    }

                }
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            // que se impriman con identado
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(filepath + ".xml");

            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        anadirDatos();
        ArrayList<String> s = new ArrayList<>();
        s.add("Formacion y orientacion laboral");
        s.add("Formacion en centros de trabajo");
        s.add("Sistemas de gestión empresarial");
        s.add("Desarrollo de interfaces");
        System.out.println(s);

        createXML(s, nombreAlumno());
        for (HashMap<String, String> string : cursos) {
            System.out.println(string);
        }
    }
}

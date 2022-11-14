package json;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class LeerJSON {
    private static final String ruta = "lis.json";

    public static void main(String[] args) {
        try {
            String stringFicheroJSON = new String(Files.readAllBytes(Paths.get(ruta)));
            System.out.println(stringFicheroJSON);
            JSONObject jsonObj = new JSONObject(stringFicheroJSON);

            System.out.println("KeySet" + jsonObj.keySet());
            System.out.println("Length " + jsonObj.length());

            // String instiValue = jsonObj.getString("cicle");
            // String value = jsonObj.ge

            // System.out.println("Insituto " + instiValue);

            JSONArray arrCicles = jsonObj.getJSONArray("cursos");
            /*
             * for (int i = 0; i < arrCicles.length(); i++) {
             * System.out.println("Empleados " + arrCicles.get(i));
             * System.out.println("Id: " + arrCicles.getJSONObject(i).get("id"));
             * System.out.println("Apellido1: " +
             * arrCicles.getJSONObject(i).get("llinatge1"));
             * System.out.println("Apellido2: " +
             * arrCicles.getJSONObject(i).get("llinatge2"));
             * System.out.println("Nombre: " + arrCicles.getJSONObject(i).get("nom"));
             * System.out.println("Telefono: " + arrCicles.getJSONObject(i).get("telefon"));
             * }
             *
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

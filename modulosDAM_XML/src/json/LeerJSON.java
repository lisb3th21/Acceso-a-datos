package json;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

public class LeerJSON {
    private static final String ruta= "C:\\Users\\lisb3\\Documents\\DAM2\\Acceso-a-datos\\lis.json";
    public static void main(String[] args) {
        try {
            String stringFicheroJSON = new String(Files.readAllBytes(Paths.get(ruta)));
            System.out.println(stringFicheroJSON);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

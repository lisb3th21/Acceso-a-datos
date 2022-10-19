package json;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.*; // Librería importada localmente

public class json {

    public static String rutaFitxer = "C:\\Users\\lisb3\\Documents\\dam2\\Acceso-a-datos\\lis.xml";
    public static final int IDENTACION = 4;

    public static void main(String[] args) {

        try {
            // Leer archivo xml y convertirlo en String
            String strfitxerXML = new String(Files.readAllBytes(Paths.get(rutaFitxer)));
System.out.println(strfitxerXML);
            // Convertir stringxml enn objeto json (Importar localmente la librería
            // org.json)
            JSONObject objJson = XML.toJSONObject(strfitxerXML);

            // Convertir objeto Json en String
            String strJson = objJson.toString(IDENTACION);
System.out.println(strJson);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
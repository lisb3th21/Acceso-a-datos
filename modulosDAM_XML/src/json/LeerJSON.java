package json;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

public class LeerJSON {
    private static final String ruta = "lis.json";

    public static void main(String[] args) {
        try {

            String stringFicheroJSON = new String(Files.readAllBytes(Paths.get(ruta)));
            // Creo el objeto JSON
            JSONObject jsonObj = new JSONObject(stringFicheroJSON);
            // Obtengo las claves raices: [segundo aÃ±o, cicle, primer aÃ±o]
            Set<String> raiz = jsonObj.keySet();
            /*
             * El el primer for recogo las claves externas y obtengo el objeto
             */
            for (String claves : raiz) {
                System.out.println("-------------------");
                System.out.println(claves.toUpperCase());
                // ! hare una u otra cosa si es un JSONArray o un JSONObject
                if (jsonObj.get(claves) instanceof JSONArray) {
                    JSONArray arrCicles = jsonObj.getJSONArray(claves);
                    int size = arrCicles.length();
                    // recorro el jsonarray obteniendo cada uno de sus valores
                    for (int i = 0; i < size; i++) {
                        JSONObject kk = arrCicles.getJSONObject(i);
                        Set<String> pp = kk.keySet();
                        for (String string : pp) {
                            System.out.println(string.toUpperCase() + ": " + kk.get(string));
                        }
                        System.out.println("");
                    }
                } else {
                    // si es que es un jsonobject obtendre el objeto e imprimire sus atributos
                    JSONObject obj = jsonObj.getJSONObject(claves);
                    Set<String> keys = obj.keySet();
                    for (String string : keys) {
                        System.out.println(string.toUpperCase() + ": " + obj.get(string));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

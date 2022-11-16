package json;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class SimpleLeer {
	private static final String ruta = "lis.json";

	public static void leerArray(JSONArray array) {

		for (int i = 0; i < array.length(); i++) {
			JSONObject kk = array.getJSONObject(i);
			Set<String> pp = kk.keySet();
			for (String string : pp) {

				if (kk.get(string) instanceof JSONArray) {
					leerArray(kk.getJSONArray(string));
				} else {
					System.out.println(string.toUpperCase() + ": " + kk.get(string));
				}

			}
			System.out.println("----------");
		}
	}

	public static void leerObj(JSONObject jsonObj) {
		Set<String> keys = jsonObj.keySet();
		// System.out.println(keys);
		for (String string : keys) {
			JSONObject obj = jsonObj.getJSONObject(string);
			// System.out.println(obj.keySet() + "hhhhhhhhhhhhhhhh");
			Set<String> set = obj.keySet();

			for (String string2 : set) {
				if (obj.get(string2) instanceof JSONArray) {
					leerArray(obj.getJSONArray(string2));
				} else {
					System.out.println(string2.toUpperCase() + ": " + obj.get(string2));

				}

			}
			System.out.println("-----------");
		}
	}

	public static void main(String[] args) throws IOException {
		String stringFicheroJSON = new String(Files.readAllBytes(Paths.get(ruta)));
		// Creo el objeto JSON
		JSONObject jsonObj = new JSONObject(stringFicheroJSON);
		// Obtengo las claves raices: [segundo aÃ±o, cicle, primer aÃ±o]
		Set<String> raiz = jsonObj.keySet();
		// System.out.println(raiz);

		for (String string : raiz) {
			leerObj(jsonObj);
		}
	}
}

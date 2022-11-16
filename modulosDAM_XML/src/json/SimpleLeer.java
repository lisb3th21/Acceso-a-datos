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
			if (!(array.get(i) instanceof JSONArray) && !((array.get(i) instanceof JSONObject))) {
				System.out.println("   " + array.getString(i).toUpperCase());

			}
			if (array.get(i) instanceof JSONObject) {

				leerObj(array.getJSONObject(i));
				System.out.println("----");
			}

		}
	}

	public static void leerObj(JSONObject jsonObj) {
		Set<String> keys = jsonObj.keySet();

		for (String string : keys) {
			if (!(jsonObj.get(string) instanceof JSONArray) && !(jsonObj.get(string) instanceof JSONObject)) {
				System.out.println(string.toUpperCase() + ": " + jsonObj.get(string));

			}

			if (jsonObj.get(string) instanceof JSONObject) {
				System.out.println("---------" + string.toUpperCase() + "----------");
				JSONObject obj = jsonObj.getJSONObject(string);

				leerObj(obj);

			} else if (jsonObj.get(string) instanceof JSONArray) {
				System.out.println(string);
				JSONArray obj = jsonObj.getJSONArray(string);
				leerArray(obj);
			}

		}
	}

	public static void main(String[] args) throws IOException {
		String stringFicheroJSON = new String(Files.readAllBytes(Paths.get(ruta)));
		// Creo el objeto JSON
		JSONObject jsonObj = new JSONObject(stringFicheroJSON);
		// Obtengo las claves raices: [segundo aÃ±o, cicle, primer aÃ±o]
		Set<String> raiz = jsonObj.keySet();
		for (String string : raiz) {
			leerObj(jsonObj);
		}
	}
}


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

/**
 * CrearFicherosXML
 */
public class CrearFicherosXML {

    
    public static final String filepath = System.getProperty("user.dir") + System.getProperty("file.separator")
            + "Prueba1.txt";

    public static void matricula() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            document.setXmlVersion("1.1");

            Element root = document.createElement("institut");
            document.appendChild(root);

            Element empleat = document.createElement("empleat");
            root.appendChild(empleat);

            Attr att_idEmpleat = document.createAttribute("id");
            att_idEmpleat.setValue("1");
            empleat.setAttributeNode(att_idEmpleat);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            // que se impriman con identado
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(filepath);

            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }





    public static void main(String[] args) {
        System.out.println(filepath);

        matricula();
    }

}
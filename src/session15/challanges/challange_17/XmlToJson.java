package session15.challanges.challange_17;
import org.json.*;

import com.google.gson.Gson;

import java.util.logging.XMLFormatter;

public class XmlToJson {

    public static void main(String[] args) {

        String XmlStr = "<bookstore>\n" +
                "    <book>\n" +
                "        <isbn>123-456-789</isbn>\n" +
                "        <title>The Great Adventure</title>\n" +
                "        <author>John Doe</author>\n" +
                "        <price>19.99</price>\n" +
                "    </book>\n" +
                "    <book>\n" +
                "        <isbn>789-101-112</isbn>\n" +
                "        <title>Java Essentials</title>\n" +
                "        <author>Jane Doe</author>\n" +
                "        <price>29.99</price>\n" +
                "    </book>\n" +
                "</bookstore>\n";

        JSONObject object = XML.toJSONObject(XmlStr);
        String jsonString = object.toString(5);
        System.out.println(jsonString);
    }
}

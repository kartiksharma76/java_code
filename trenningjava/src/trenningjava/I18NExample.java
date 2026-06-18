package trenningjava;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18NExample {
    public static void main(String[] args) {

        // Change Locale to Spanish
        Locale locale = new Locale("es", "ES");

        ResourceBundle bundle =
        	    ResourceBundle.getBundle("trenningjava.MessageBundle", locale);

        System.out.println("Message in " + locale + ": "
                + bundle.getString("greeting"));

        // Output: Message in es_ES: ¡Hola!
    }
}

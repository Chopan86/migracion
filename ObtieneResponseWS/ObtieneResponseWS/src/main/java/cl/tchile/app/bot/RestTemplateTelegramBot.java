package cl.tchile.app.bot;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.InputStreamReader;
import java.net.URLEncoder;

@Component
public class RestTemplateTelegramBot {
    public static String peticionHttpGet(String chatId,String messageText) throws Exception {
        messageText = URLEncoder.encode(messageText,"UTF-8");
        String urlV = "http://localhost:8080/send-message?chatId=" + chatId + "&messageText=" + messageText;
        StringBuilder resultado = new StringBuilder();
        URL url = new URL(urlV);


        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");

        BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
        String linea;

        while ((linea = rd.readLine()) != null) {
            resultado.append(linea);
        }

        rd.close();

        return resultado.toString();
    }

}

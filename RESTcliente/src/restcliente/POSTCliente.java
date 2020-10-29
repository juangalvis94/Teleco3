package restcliente;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
public class POSTCliente {
public static void main(String[] args) throws MalformedURLException, IOException {
URL url = new URL("http://localhost:3000/datos");
HttpURLConnection conn = (HttpURLConnection) url.openConnection();
conn.setDoOutput(true);
conn.setRequestMethod("POST");
conn.setRequestProperty("Content-Type", "application/json");
String input = "{\"id\":8,\"temperatura\":35,\"humedad\":80}";
OutputStream os = conn.getOutputStream();
os.write(input.getBytes());
os.flush();
if (conn.getResponseCode() != 200) {
throw new RuntimeException("Failed : HTTP error code : "
+ conn.getResponseCode());
}
conn.disconnect();
}
}
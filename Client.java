import java.io.*;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws IOException {
		
		final String localthost = "127.0.0.1";
		Socket clientSocket = new Socket(localthost, Server.SERVER_PORT);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		String name = "Danil Agafonov";
		out.write(name);
		out.flush();
		out.close();
	}
}
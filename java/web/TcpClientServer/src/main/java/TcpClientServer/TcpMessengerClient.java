package TcpClientServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class TcpMessengerClient {
	
	public final static int SERVER_PORT = 61010;
	public final static String SERVER_ADDRESS = "127.0.0.1";

	public static void main(String[] args) throws IOException {
		
		System.out.println("Client Starts...");
		
		BufferedReader brReader = null;
		Socket socket = new Socket();
		
		try {
			InetAddress inAddress = InetAddress.getByName(SERVER_ADDRESS);			
			SocketAddress serverSocketAddress = new InetSocketAddress(inAddress, SERVER_PORT);
			socket.setReuseAddress(true);
			socket.connect(serverSocketAddress);
			
			brReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line;
			while ((line = brReader.readLine()) != null) {
				System.out.println(line);
				if (line.equals("Bye Bye")) {
					break;
				}
			}
		} catch (IOException e) {
			System.out.println("Network I/O error");
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					System.out.println("Failed to close socket");
				}
			}
			if (brReader != null) {
				try {
					brReader.close();
				} catch (IOException e) {
					System.out.println("I/O error");
				}
			}	
		}
	}
}

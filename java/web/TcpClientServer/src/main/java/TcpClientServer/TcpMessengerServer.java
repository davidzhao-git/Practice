package TcpClientServer;

import java.net.InetAddress;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpMessengerServer {
	
	private final static int SERVER_LISTENING_PORT = 61010;
	private final static int SERVER_BACKLOG = 6;
	private final static String SERVER_BIND_ADDRESS = "127.0.0.1";
	
	public static void main(String[] args) throws IOException {
		System.out.println("Server starts...");
		
		// Determines the IP address of a host, given the host's name.
		InetAddress serverInAddress = InetAddress.getByName(SERVER_BIND_ADDRESS);
		
		try (ServerSocket listeningSocket = new ServerSocket(SERVER_LISTENING_PORT, SERVER_BACKLOG, serverInAddress)) {
		
			listeningSocket.setReuseAddress(true);
			try (Socket socket = listeningSocket.accept();
					PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
					Scanner scanner = new Scanner(System.in);) {
				
				socket.setReuseAddress(true);
				writer.println("Hello, Client. You are connected to the Server!");
				writer.flush();
				System.out.println("Server: " + "Received client request");
				String message; 
				System.out.println("Enter Message ('Bye Bye' to exit) ");
				while ((message = scanner.nextLine()) != null) {
					writer.print(message);
					writer.flush();
					System.out.print("Enter Message ('Bye Bye' to exit) ");
					if (message.equals("Bye Bye")) {
						break;
					}

				}
						
			}
			
		}
				
	}
}



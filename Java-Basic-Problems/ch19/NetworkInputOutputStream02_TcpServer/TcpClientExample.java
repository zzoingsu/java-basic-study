package ch19.NetworkInputOutputStream02_TcpServer;

import java.io.IOException;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class TcpClientExample {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localHost", 50001);	
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

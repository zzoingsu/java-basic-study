package ch19.NetworkInputOutputStream03_TcpServerDataSending;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static ServerSocket serverSocket = null;
	
	public static void main(String[] args) {
		startServer();
		stopServer();
	}
	
	public static void startServer() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(50001);
					System.out.println("[서버시작]");
					while (true) {
						Socket socket = serverSocket.accept();
						System.out.println("[클라이언트 연결됨]");
						
						DataInputStream dis = new DataInputStream(socket.getInputStream());
						String message = dis.readUTF();
						System.out.println("받은 메세지: " + message);
						
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						dos.writeUTF("서버 응답: 메세지 수신 완료");
						
						dis.close();
						dos.flush();
						dos.close();
						socket.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		thread.start();
	}
	
	public static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("[서버 종료]");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

package ch19.NetworkInputOutputStream02_TcpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerExample {
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
					System.out.println("[서버 시작]");
					
					while(true) {
						Socket socket = serverSocket.accept();
						System.out.println("[클라이언트 연결됨]");
						
						InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
						System.out.println("클라이언트 IP: " + isa.getHostString());
						System.out.println("클라이언트 포트: " + isa.getPort());
						
						socket.close();
						System.out.println("[서버 종료]");
					}
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		thread.start();
	}
	
	public static void stopServer() {
		try {
			serverSocket.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}

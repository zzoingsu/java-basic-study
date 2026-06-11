package ch19.sec3.exam02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("Localhost", 50001);
			System.out.println("[클라이언트] 연결 성공");
			
			String sendMessage = "월드컵 화이팅!";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("[클라이언트] 데이터 받음: " + receiveMessage);
			
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}

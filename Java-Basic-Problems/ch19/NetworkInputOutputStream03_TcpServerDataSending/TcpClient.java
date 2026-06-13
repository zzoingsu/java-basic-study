package ch19.NetworkInputOutputStream03_TcpServerDataSending;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 50001);
			System.out.println("[서버 연결 성공]");
			
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF("안녕하세요 서버");
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String message = dis.readUTF();
			System.out.println("서버 응답: " + message);
			
			System.out.println("[클라이언트 종료]");
			dos.flush();
			dos.close();
			dis.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

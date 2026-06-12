package ch19.NetworkInputOutputStream01_HostInfo;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostIpInfoExample {

	public static void main(String[] args) {
		try {
			InetAddress ias = InetAddress.getLocalHost();
			System.out.println("호스트 이름: " + ias.getHostName());
			System.out.println("IP 주소: " + ias.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}

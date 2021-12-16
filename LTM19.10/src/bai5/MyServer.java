package bai5;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	// IPv6: 2402:800:620e:215f:1dd1:5b3b:abb2:495d
	// IPv4: 116.97.53.84
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5000);
			while(true) {
				Socket s = server.accept();
				System.out.println(s.getInetAddress());
				s.close();
			}
		}
		catch(Exception e) {
			
		}
	}
}

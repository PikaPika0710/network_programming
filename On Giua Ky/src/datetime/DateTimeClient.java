package datetime;

import java.io.DataInputStream;
import java.net.Socket;

public class DateTimeClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 3000);
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			while(true) {
				System.out.println(dis.readUTF());	
			}	
		} catch (Exception e) {
			
		}
	}
}

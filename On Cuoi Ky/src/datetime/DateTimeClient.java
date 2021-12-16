package datetime;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class DateTimeClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket soc = new Socket("localhost", 3000);
		DataInputStream dis = new DataInputStream(soc.getInputStream());
		while (true) {
			String s = dis.readUTF();
			System.out.println(s);
		}
		
	}
}

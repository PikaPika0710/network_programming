package bai5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class DateTimeClient {
	public static void main(String[] args) {
		Socket socket;
		try {
			/* Connect to Tuan's Server and write */
//			socket = new Socket(InetAddress.getByName("118.71.133.217"),80);
//			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
//			dos.writeUTF("102190298, Tran Cong Viet");

			/* Connect to Viet's server and read */
			socket = new Socket("localhost", 5000);
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			System.out.println(dis.readUTF());
		} catch (Exception ex) {
			
		}
	}
}

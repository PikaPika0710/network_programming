package bai5;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateTimeServer {
	public static void main(String[] args) {
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(5000);
			while(true) {
				Socket socket = serverSocket.accept();
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				Date d = new Date();
				dos.writeUTF(d.toString());
			}
		}
		catch(Exception ex) {
			
		}
	}
}

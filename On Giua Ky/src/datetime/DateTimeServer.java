package datetime;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateTimeServer {
	public static void main(String[] args) {
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(3000);
			while (true) {
				Socket soc = serverSocket.accept();
				DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
				while(true) {
					Date d = new Date();
					dos.writeUTF(d.toString());
				}
			}

		} catch (Exception e) {
		}
	}
}

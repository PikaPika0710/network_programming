package datetime;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateTimeServer {
	private static final int port = 3000;
	public static void main(String[] args) {
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			Socket soc = serverSocket.accept();
			DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
			while (true) {
				String s = new Date().toString();
				dos.writeUTF(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

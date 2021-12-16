package tinhtoan;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TinhToanServer {
	public static void main(String[] args) {
		new TinhToanServer();
	}

	public TinhToanServer() {
		try {
			ServerSocket serversocket = new ServerSocket(5000);
			while (true) {
				Socket soc = serversocket.accept();
				DataInputStream dis = new DataInputStream(soc.getInputStream());
				DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
				dos.writeUTF("Input a: ");
				Double a = Double.parseDouble(dis.readUTF());
				dos.writeUTF("Input b: ");
				Double b = Double.parseDouble(dis.readUTF());
				dos.writeUTF("Input func: ");
				String fuc = dis.readUTF().trim();
				Double res = 0d;
				if (fuc.equals("+")) {
					res = a + b;
				} else if (fuc.equals("-")) {
					res = a - b;
				} else if (fuc.equals("*")) {
					res = a * b;
				} else {
					res = a / b;
				}
				dos.writeUTF("RES: " + String.valueOf(res));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

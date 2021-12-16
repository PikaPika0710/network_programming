package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer {
	private static final int port = 3333;
	// Tao 1 vecto clients đã kết nối trước đó
	Vector<XuLyGui> clients = new Vector<XuLyGui>();

	public static void main(String[] args) throws IOException {
		new ChatServer();
	}

	public ChatServer() throws IOException {
		ServerSocket ss = new ServerSocket(port);
		while (true) {
			Socket soc = ss.accept();
			XuLyGui xlg = new XuLyGui(soc, this);
			clients.add(xlg);
			xlg.start();
		}
	}

}

class XuLyGui extends Thread {
	private ChatServer cs;
	private String name;
	private Socket soc;

	public XuLyGui(Socket pSoc, ChatServer pCs) {
		this.cs = pCs;
		this.soc = pSoc;
	}

	public void run() {
		try {
			DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
			DataInputStream dis = new DataInputStream(soc.getInputStream());
			dos.writeUTF("Enter your name: ");
			name = dis.readUTF();
			//Tien hanh gui message cua client nay cho cac client #
			while (true) {
				String msg = dis.readUTF();
				for (XuLyGui xlg : cs.clients) {
					DataOutputStream dos1 = new DataOutputStream(xlg.soc.getOutputStream());
					dos1.writeUTF(name + ">" + msg);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

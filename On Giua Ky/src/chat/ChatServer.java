package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer {
	
	Vector<XuLy> clients = new Vector<XuLy>();

	public static void main(String[] args) {
		new ChatServer();
	}

	public ChatServer() {
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(5000);
			while (true) {
				Socket soc = serverSocket.accept();
				XuLy xl = new XuLy(soc, this);
				clients.add(xl);
				xl.start();
			}
		} catch (Exception e) {

		}
	}
}

class XuLy extends Thread {
	Socket soc;
	ChatServer cs;
	String name;

	public XuLy(Socket pSoc, ChatServer pcs) {
		this.soc = pSoc;
		this.cs = pcs;
	}

	@Override
	public void run() {
		try {

			DataInputStream dis = new DataInputStream(soc.getInputStream());
			DataOutputStream dos = new DataOutputStream(soc.getOutputStream());

			dos.writeUTF("Input your name: ");
			name = dis.readUTF();

			while (true) {
				String msg = dis.readUTF();
				for (XuLy xl : cs.clients) {
					DataOutputStream dos1 = new DataOutputStream(xl.soc.getOutputStream());
					dos1.writeUTF(name + ": " + msg);
				}
			}

		} catch (Exception e) {
		}

	}
}

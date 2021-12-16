package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer {
	//create a vecto of clients used for sending messages of one clients to all
	//every clients will see the messages of one

	Vector<Xuly> clients = new Vector<Xuly>();

	public static void main(String[] args) {
		new ChatServer();
	}

	public ChatServer() {
		try {
			//Server Socket used for receiveing port and listening request from clients
			ServerSocket server = new ServerSocket(53);
			while (true) {
				//accept a connection request from a client 
				Socket soc = server.accept();
				Xuly x = new Xuly(soc, this);
				clients.add(x);
				x.start();
			}
		} catch (Exception e) {

		}
	}
}

class Xuly extends Thread {
	Socket soc;
	String name;
	ChatServer cs;

	public Xuly(Socket soc, ChatServer cs) {
		this.soc = soc;
		this.cs = cs;

	}

	public void run() {
		try {
			// soc.setSoTimeout(1000);
			DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
			DataInputStream dis = new DataInputStream(soc.getInputStream());
			
			// every client will have a name by 
			dos.writeUTF("Please input your name: ");
			name = dis.readUTF();

			while (true) {
				// Receive messages from this client and send to all other clients
				String mgs = dis.readUTF();
				for (Xuly c : cs.clients) {
					DataOutputStream dos1 = new DataOutputStream(c.soc.getOutputStream());
					dos1.writeUTF(name + "> " + mgs);
				}
			}
		} catch (Exception e) {

		}

	}
}

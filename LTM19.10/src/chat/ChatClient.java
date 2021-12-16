package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	public static void main(String[] args) {
		new ChatClient();
	}

	public ChatClient() {
		try {
			Scanner sc = new Scanner(System.in);

			//Socket soc = new Socket(InetAddress.getByName("118.71.133.217"), 80);
			Socket soc = new Socket("localhost", 53);
			DataInputStream dis = new DataInputStream(soc.getInputStream());
			DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
			// Input name to Server
			System.out.println(dis.readUTF());
			String name = sc.nextLine();
			dos.writeUTF(name);
			new XuLyNhan(soc).start();
			while (true) {
				// Input message to Server
				String msg = sc.nextLine();
				dos.writeUTF(msg);
				// Receive messages from Server

			}
		} catch (Exception e) {

		}
	}
}

class XuLyNhan extends Thread {
	Socket soc;

	public XuLyNhan(Socket soc) {
		this.soc = soc;
	}

	public void run() {
		try {
			DataInputStream dis = new DataInputStream(soc.getInputStream());
			while (true) {
				System.out.println(dis.readUTF());
			}
		} catch (Exception e) {

		}

	}
}

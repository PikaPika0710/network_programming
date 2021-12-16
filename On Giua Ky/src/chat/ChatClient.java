package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	public static void main(String[] args) {
		new ChatClient();
	}

	public ChatClient() {
		Scanner sc = new Scanner(System.in);
		try {
			Socket soc = new Socket("localhost", 5000);
			DataInputStream dis = new DataInputStream(soc.getInputStream());
			DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
			System.out.println(dis.readUTF());
			String name = sc.nextLine();
			dos.writeUTF(name);
			new XuLyNhan(soc).start();
			while (true) {
				System.out.print("Reply: ");
				String msg = sc.nextLine();
				dos.writeUTF(msg);
			}
		} catch (Exception e) {

		}
		sc.close();
	}

}

class XuLyNhan extends Thread {
	Socket soc;

	public XuLyNhan(Socket pSoc) {
		this.soc = pSoc;
	}

	public void run() {
		try {
			DataInputStream dis = new DataInputStream(soc.getInputStream());
			while (true) {
				System.out.println(dis.readUTF());
			}
		} catch (Exception ex) {
		}

	}
}

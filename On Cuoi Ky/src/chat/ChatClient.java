package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClient {
	private static final int port = 3333;

	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);
		Socket soc = new Socket("localhost", port);
		DataInputStream dis = new DataInputStream(soc.getInputStream());
		DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
		System.out.println(dis.readUTF());
		String name = sc.nextLine();
		dos.writeUTF(name);
		new XuLyNhan(soc).start();
		while(true) {
			System.out.print("Reply: ");
			String msg = sc.nextLine();
			dos.writeUTF(msg);
		}
	}
}

class XuLyNhan extends Thread {
	Socket soc;

	public XuLyNhan(Socket pSoc) {
		this.soc = pSoc;
	}

	public void run() {
		DataInputStream dis;
		try {
			dis = new DataInputStream(soc.getInputStream());
			while (true) {
				System.out.println(dis.readUTF());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
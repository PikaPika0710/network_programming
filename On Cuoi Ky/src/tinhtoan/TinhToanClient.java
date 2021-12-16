package tinhtoan;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TinhToanClient {
	public static void main(String[] args) {
		new TinhToanClient();
	}

	public TinhToanClient() {
		Scanner sc = new Scanner(System.in);
		try {
			while(true) {
			Socket soc = new Socket(InetAddress.getByName("localhost"), 5000);
			DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
			DataInputStream dis = new DataInputStream(soc.getInputStream());
			System.out.print(dis.readUTF());
			Double a = Double.parseDouble(sc.nextLine());
			dos.writeUTF("" + a);
			System.out.print(dis.readUTF());
			Double b = Double.parseDouble(sc.nextLine());
			dos.writeUTF("" + b);
			System.out.print(dis.readUTF());
			String func = String.valueOf(sc.nextLine());
			dos.writeUTF(func);
			System.out.println(dis.readUTF());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

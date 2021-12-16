package bai1;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ConnectToWeb {
	public static void main(String[] args) {
		try {
			Scanner sc=  new Scanner(System.in);
			System.out.print("Server name: ");
			String name = sc.nextLine();
			int port = 80;
			Socket soc = new Socket(InetAddress.getByName(name), port);
			System.out.println(soc.getLocalAddress()); // địa chỉ của chúng ta
			System.out.println(soc.getInetAddress()); // địa chỉ của server kết nối
			sc.close();
		}
		catch(Exception e) {
			
		}
	}
}	

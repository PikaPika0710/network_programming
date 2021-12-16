package bai1;

import java.net.InetAddress;
import java.util.Scanner;

public class GetHostnameIP {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			//InetAddress[] ips = InetAddress.getAllByName(InetAddress.getLocalHost().getHostName());
			//InetAddress[] ips = InetAddress.getAllByName("www.facebook.com");
			//InetAddress[] ips = InetAddress.getAllByName("dut.udn.vn");
			System.out.print("Server's name: "); 			
			String name = sc.nextLine();
			InetAddress[] ips = InetAddress.getAllByName(name);
			for (InetAddress ip : ips) {
				System.out.println(ip.getHostAddress());
				System.out.println(ip.getHostName());
			}
			sc.close();
		} catch (Exception e) {

		}
	}
}

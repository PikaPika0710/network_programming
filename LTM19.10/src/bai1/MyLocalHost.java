package bai1;
import java.net.InetAddress;

public class MyLocalHost {
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getLocalHost();
			System.out.println(ia.getHostAddress());
			System.out.println(ia.getHostName());
			System.out.println(ia);
		}
		catch(Exception e) {}
		
	}
}

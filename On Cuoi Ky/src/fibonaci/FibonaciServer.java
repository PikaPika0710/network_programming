package fibonaci;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class FibonaciServer {
	public static void main(String[] args) {
		new FibonaciServer();
	}

	public FibonaciServer() {
		try {
			DatagramSocket ds = new DatagramSocket(2010);
			while (true) {
				byte[] data = new byte[1000];
				DatagramPacket dp = new DatagramPacket(data, data.length);
				ds.receive(dp);
				int n = Integer.parseInt(new String(dp.getData()).trim());
				System.out.println(n);
				if (isFb(n)) {
					System.out.println(n + " la so thuoc day FIBO");
					break;
				} else {
					System.out.println(n + " khong la so thuoc day FIBO");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private boolean isFb(int parseInt) {
		int d = 0;
		while (fibonacci(d) <= parseInt) {
			if (fibonacci(d) == parseInt)
				return true;
			++d;
		}
		return false;
	}

	public static int fibonacci(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}

package fibonaci;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;

public class FibonaciClient implements Runnable {
	public static void main(String[] args) {
		new Thread(new FibonaciClient()).start();
	}

	@Override
	public void run() {
		Random rd = new Random();
		try {
			while (true) {
				DatagramSocket ds = new DatagramSocket();

				int n = rd.nextInt(10);
				String s = "" + n;
				DatagramPacket dp1 = new DatagramPacket(s.getBytes(), s.length(), InetAddress.getByName("localhost"),
						2010);
				ds.send(dp1);
				Thread.sleep(1000);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

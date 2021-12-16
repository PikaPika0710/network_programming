package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ExchangeRateServer {
	public static void main(String[] args) {
		new ExchangeRateServer();
	}

	public ExchangeRateServer() {
		try {
			DatagramSocket ds = new DatagramSocket(3445);
				while (true) {
					byte[] buf = new byte[1000];
					DatagramPacket dp = new DatagramPacket(buf, buf.length);
					ds.receive(dp);
					System.out.println(new String(dp.getData()));
				}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
}

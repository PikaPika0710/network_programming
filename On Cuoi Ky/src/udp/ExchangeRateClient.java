package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;

public class ExchangeRateClient extends JFrame implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new Thread(new ExchangeRateClient()).start();
	}

	public ExchangeRateClient() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(3);
		this.setVisible(true);
	}

	@Override
	public void run() {
		while (true) {
			try {
				DatagramSocket ds = new DatagramSocket();
				String str = "Hello World";
				DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("localhost"),
						3445);
				ds.send(dp);
				Thread.sleep(1000);
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

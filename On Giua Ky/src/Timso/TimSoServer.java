package Timso;

import java.awt.Point;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;



public class TimSoServer extends Thread{
	public static void main(String[] args) {
		new TimSoServer();
	}
	static int n = 15;
	static List<Point> dadanh = new ArrayList<Point>();
	static Vector<Xuly> clients = new Vector<Xuly>();
	int matran[][] = new int[n][n];
	public TimSoServer() {
		this.start();
		try {
			ServerSocket server = new ServerSocket(2000);
			while(true) {
				Socket s= server.accept();
				Xuly v = new Xuly(s);
				clients.add(v);
				if(clients.size()<=4) {
					v.start();
					server.close();
				}		
			}
		} catch (Exception e) {

		}
	}
}
class Xuly extends Thread {
	
	Socket soc;
	DataOutputStream dos;
	DataInputStream dis;
	public Xuly(Socket soc) {
		try {
			this.soc = soc;
			dos = new DataOutputStream(soc.getOutputStream());
			dis = new DataInputStream(soc.getInputStream());
			for(Point p: TimSoServer.dadanh) {
				dos.writeUTF(p.x + "");
				dos.writeUTF(p.y + "");
			}
		} catch (Exception e) {
		}
	}
	
	public void run() {
		try {
			loop: while(true) {
				int ix = Integer.parseInt(dis.readUTF());
				int iy = Integer.parseInt(dis.readUTF());
				
				if(TimSoServer.clients.size()<4) continue;
				
				if(this == TimSoServer.clients.get(0) && TimSoServer.dadanh.size()%2!=0) {
					continue;
				}
				if(this == TimSoServer.clients.get(1) && TimSoServer.dadanh.size()%2==0) {
					continue;
				}		
				
				if(ix<0 || ix>=TimSoServer.n) continue;
				if(iy<0 || iy>=TimSoServer.n) continue;
				for (Point d : TimSoServer.dadanh) {
					if (ix == d.x && iy == d.y)
						continue loop;
				}
				TimSoServer.dadanh.add(new Point(ix,iy));
				
				for (Xuly c : TimSoServer.clients) {
						c.dos.writeUTF(ix + "");
						c.dos.writeUTF(iy + "");
					}
				}
		
		}catch(Exception e) {
			
		}
	}
}
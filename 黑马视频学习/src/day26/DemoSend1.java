package day26;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class DemoSend1 {

	public static void main(String[] args) throws Exception {
		String str = "Nice to meet you!";
		DatagramSocket socket = new DatagramSocket();
		DatagramPacket packet = 
				new DatagramPacket(str.getBytes(),str.length(),
						InetAddress.getByName("127.0.0.1"),6666);
		socket.send(packet);
		socket.close();
	}

}

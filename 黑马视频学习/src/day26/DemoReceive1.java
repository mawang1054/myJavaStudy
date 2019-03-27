package day26;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import javax.xml.ws.handler.MessageContext.Scope;

class DemoReceive1 {

	public static void main(String[] args) throws Exception {
		while(true) {
			DatagramSocket socket = new DatagramSocket(6666);
			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
			socket.receive(packet);
			socket.close();
			
			System.out.println(new String(packet.getData(), 0, packet.getLength()));
		}
	}

}

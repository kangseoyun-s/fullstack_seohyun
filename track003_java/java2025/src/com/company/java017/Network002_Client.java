package com.company.java017;

import java.io.IOException;
import java.net.Socket;

public class Network002_Client {

	public static void main(String[] args) {
		// 1. client
		Socket socket = null;
		
		try {
			// 2. 고객이 AS 센터에 연락
			socket = new Socket("127.0.0.1", 703);
			System.out.println("[Client] 3. AS센터에 고객 문의");
			Thread sender = new Sender(socket); sender.start();
			Thread receiver = new Receiver(socket); receiver.start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

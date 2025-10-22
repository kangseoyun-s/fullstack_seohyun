package com.company.java017;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class Network002_Server {

	public static void main(String[] args) {
		// 1. 서버 소켓(AS 센터) [,,,,]
		ServerSocket ascenter=null;
		Socket socket;
		// 2. localhost(127.0.0.1) / port(80웹, 443웹 자물쇠)
		try {
			ascenter = new ServerSocket(703);
			System.out.println("[Server] 서버 준비 완료 A/S 센터 오픈");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 3. 클라이언트 요청(accept) 오면 상담사(socket) 연결
		try {
			System.out.println("[Server] 고객 기다리는 중");
			socket = ascenter.accept();
			// 1. 연결 요청 대기 / 연결 오면 수락
			// 2. 연결 들어올 때까지 멈춤
			// 3. 연결 socket으로 연결
			System.out.println("[Server] 고객님 연락 와서 상담사(socket)랑 연결");
			Thread sender = new Sender(socket); sender.start();
			Thread receiver = new Receiver(socket); receiver.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
// 상담사(Server socket) 말하기 + 듣기
// 고객(Client socket) 말하기 + 듣기
class Sender extends Thread{ // 작업 수행 클래스
	Socket socket;
	DataOutputStream out;
	String who;
	SimpleDateFormat sdf;
	
	public Sender() {
	}

	public Sender(Socket socket) {
		this.socket = socket; // 상대방과 연결된 정보
		try {
			out = new DataOutputStream(socket.getOutputStream());
			out.writeUTF("Hello... Start! >>");
			// 1. WHO + 시간
			this.who = "[" + (socket.getPort()==703? "Client" : "Server");
			this.sdf = new SimpleDateFormat("  hh:mm:ss]");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void run() { // todo
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드로 써서 말하기
		try {
			while (out != null) {
				String data = br.readLine();
				String time = sdf.format(System.currentTimeMillis());
				out.writeUTF(who + time + data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}finally {
				try {
					if (out != null) {
						out.close();
					}
					if (br !=null) {
						br.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

class Receiver extends Thread{ 
	Socket socket;
	DataInputStream in;

	public Receiver() {
		
	}

	public Receiver(Socket socket) {
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream()); // 들을 준비
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {while(in !=null) {
				System.out.println(in.readUTF());
			} // 실시간 듣기
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("통신을 마무리합니다. >> " + socket);
			
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (!socket.isClosed()) {
					socket.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
/*
  
1. http 통신 - 단방향 통신(client 요청이 있을 때, server가 응답하고 연결 종료 방식) / jsp, spring
2. socket 통신 - 양방향 통신(특정 포트를 통해 실시간으로 정보 주고받기 - tcp/udp)  
3. 소켓 통신 흐름 
 1) 서버 소켓(as 센터), 포트바인딩(문 열기)
 2) 클라이언트 연결 요청, 수락
 3) 클라이언트 소켓(socket) 상담사가 읽어들이기(InputStream > 프로그램 기준 > OutputStream) 말하기
 4) 말하고 주고받기
 */
 
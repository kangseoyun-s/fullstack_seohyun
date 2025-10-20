package com.company.java016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Network001 {

	public static void main(String[] args) throws IOException {
		try {
			// 1. url
			URL url = new URL("https://www.google.com/");
			// 2. 연결 객체
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// 3. 요청 설정
			conn.setRequestMethod("GET");
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setReadTimeout(1000);
			// 4. 응답 코드
			int code = conn.getResponseCode(); // 구글에서 응답
			System.out.println(code); // 200 응답 성공 404 페이지 X 500번대 코드 오류
			// 5. 응답 데이터 BufferedReader > [Network001-프로그램] > BufferedWriter
			BufferedReader br;
			if (code == 200) {// 한 줄씩 읽을 수 있게 속도 향상(바이트 스트림을 문자 스트림으로(응답 데이터 스트림))
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {// 한 줄씩 읽을 수 있게 속도 향상(바이트 스트림을 문자 스트림으로(응답 데이터 스트림))
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			String line = "";
			StringBuffer sb = new StringBuffer();
			while ((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
			System.out.println(sb.toString());
			br.close();
			conn.disconnect();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

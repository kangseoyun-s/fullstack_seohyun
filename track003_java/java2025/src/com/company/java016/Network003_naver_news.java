package com.company.java016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class Network003_naver_news {
	public static void main(String[] args) {
		try {
			// 1. URL
			String apiurl;
			apiurl = "https://openapi.naver.com/v1/search/news.json?query=" + URLEncoder.encode("캄보디아", "UTF-8");
			URL url = new URL(apiurl);
			// 2. HttpURLConnection
			HttpURLConnection conn =(HttpURLConnection)url.openConnection();
			// 3. 요청 설정 - get
			// > X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
			// > X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id", "dumNMJ1hLv5ZD2yOBL8G");
			conn.setRequestProperty("X-Naver-Client-Secret", "RJuFqn7Ijq");
			// 4. 응답 확인
			BufferedReader br;
			if (conn.getResponseCode() == 200) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			// 5. 응답 데이터
			String line = "";
			StringBuffer sb = new StringBuffer();
			while((line=br.readLine())!=null) {
				sb.append(line + "\n");
			}
			System.out.println(sb.toString());
			br.close(); conn.disconnect();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rset = null;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String pass = "tiger";
	// 드커프리
	// 0. 데이터 넘겨받기
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	out.println(email + "/" + password);
	//1. 드라이버 연동
	Class.forName(driver);
	// 2. 커넥션
	try {
		conn = DriverManager.getConnection(url, user, pass);
		String sql = "select count(*) cnt, APP_USER_ID from APP_USER where email=? and password=? group by APP_USER_ID";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, email);
		pstmt.setString(2, password);
		rset = pstmt.executeQuery();
		int result = -1;
		int APP_USER_ID = -1;
		while (rset.next()) {
			result = rset.getInt("cnt");
			APP_USER_ID = rset.getInt("APP_USER_ID");
			// # 브라우저-서버에 정보 남기기 - session (사용할 수 있는 시간) / 브라우저 닫힐 때까지
			session.setAttribute("email", email);
			session.setAttribute("APP_USER_ID", APP_USER_ID);
		}
		if (result == 1) {
			out.println( "<script> alert('로그인 성공!'); location.href='mypage.jsp?APP_USER_ID=" + APP_USER_ID + "'; </script>");
		} else {
			out.println("<script> alert('정보를 확인해 주세요.'); history.go(-1); </script>");
		}
	} catch (Exception e) { e.printStackTrace();
	} finally {
		if (rset != null) rset.close();
		if (pstmt != null) pstmt.close();
		if (conn != null) conn.close();
	}
%>
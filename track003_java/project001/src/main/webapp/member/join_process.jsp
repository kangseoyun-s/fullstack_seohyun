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
int mbti_type_id = Integer.parseInt(request.getParameter("mbti_type_id"));
out.println(email + "/" + password + "/" + mbti_type_id);
// 1. 드라이버 연동
try {
	Class.forName(driver);

	// 2. 커넥션
	conn = DriverManager.getConnection(url, user, pass);
	// 3. PreparedStatment
	String sql = "insert into appuser (APP_USER_ID, EMAIL, PASSWORD, MBTI_TYPE_ID,CREATED_AT) values (appuser_seq.nextval,?,?,?,SYSDATE)";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, email);
	pstmt.setString(2, password);
	pstmt.setInt(3, mbti_type_id);
	// 4. 결과
	int result = pstmt.executeUpdate(); // 실행한 줄수
	if (result > 0) {
		out.println("<script> alert('회원 가입 성공'); location.href='login.jsp'; </script>");
	}
	else {out.println("<script> alert('관리자에게 문의 바랍니다.'); history.go(-1); </script>");}
} catch (Exception e) {
	out.println("오류: " + e.getMessage());
} finally {
	if(rset !=null) rset.close();
	if(pstmt !=null) pstmt.close();
	if(conn !=null) conn.close();
}
%>
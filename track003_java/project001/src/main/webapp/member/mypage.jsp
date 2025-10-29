<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>
	<%@ include file="../inc/header.jsp"%>
	<div class="container card  my-5">
		<h3 class="card-header"></h3>
		<%
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pass = "tiger";
		String EMAIL = "";
		int MBTI_TYPE_ID = 0;
		String CREATED_AT = "";
		String mbti ="";
		// 드커프리
		// 0. 데이터 넘겨받기
		int APP_USER_ID = Integer.parseInt(request.getParameter("APP_USER_ID"));
		// 1. 드라이버 연동
		try {
			Class.forName(driver);
			// 2. 커넥션
			conn = DriverManager.getConnection(url, user, pass);
			// 3. prepareStatement
			String sql = "select * from appuser where APP_USER_ID=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, APP_USER_ID);
			// 4. resultset

			rset = pstmt.executeQuery();
			while (rset.next()) {
				EMAIL = rset.getString("EMAIL");
				MBTI_TYPE_ID = rset.getInt("MBTI_TYPE_ID");
				CREATED_AT = rset.getString("CREATED_AT");
			}
			// 만약 mbti id가 1이라면 ENTP, 2라면 INTP, 3이라면 ISTJ if/switch/상항연산자
			switch(MBTI_TYPE_ID){
			case 1: mbti = "ISTJ"; break;
		    case 2: mbti = "ISFJ"; break;
		    case 3: mbti = "INFJ"; break;
		    default: mbti = "Unknown"; break;
			}
			out.println(mbti);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rset != null)
				rset.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
		%>
		<table class="table table-hover table-bordered table-striped">
			<tbody class="table-info">
				<tr>
					<th scope="row">Email</th>
					<td><%=EMAIL%></td>
				</tr>
				<tr>
					<th scope="row">MBTI_TYPE</th>
					<td><%=mbti%></td>
				</tr>
				<tr>
					<th scope="row">회원 가입 날짜</th>
					<td><%=CREATED_AT%></td>
				</tr>
			</tbody>
		</table>
	</div>
	<%@ include file="../inc/footer.jsp"%>
</body>
</html>
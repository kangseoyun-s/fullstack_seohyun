<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
   <div class="container card  my-5">
      <h3  class="card-header">  </h3>
      <%@page import="java.sql.Connection"%>
      <%//드커프리
      //1. 드라이버 연결 
      Class.forName("oracle.jdbc.driver.OracleDriver");

    // 2. db 연결
     String url     ="jdbc:oracle:thin:@localhost:1521:xe";
     String user    ="scott";
     String password="tiger";
     
     Connection conn = DriverManager.getConnection(url,user,password);
     
     if(conn!=null){out.println("db 연동 성공!"); conn.close();} %>
   </div>
</body>
</html>
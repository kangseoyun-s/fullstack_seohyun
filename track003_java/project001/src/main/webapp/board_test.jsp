<%@page import="com.thejoa703.dto.PostDto"%>
<%@page import="com.thejoa703.dao.PostDao"%>
<%@ page contentType="text/html; charset=UTF-8" %>
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
      <h3  class="card-header"> DAO TEST </h3>
      <%--<pre class="alert alert-success">
      1.insert
      </pre>
        <% 
      PostDao dao = new PostDao();
      PostDto dto = new PostDto();
      dto.setAppUserId(1);
      dto.setTitle("첫 번째 글쓰기");
      dto.setContent("내용");
      dto.setPass("1111");
      out.println(dao.insert(dto));
      %>--%>
      <pre class="alert alert-success">
<%--       2. selectAll
      </pre>
      <%PostDao dao = new PostDao();
      out.println(dao.selectAll());
      %> --%>
     <%--  <pre class="alert alert-success">
      3. select
      </pre>
      <%PostDao dao = new PostDao();
      out.println(dao.update_hit(1));
      out.println(dao.select(1));
      %>
       --%>
     <%-- 4. update
      <%
     PostDao dao = new PostDao();
     PostDto dto = new PostDto();
     out.println(dao.update(dto));
     %>
      --%>
      
    5. delete
     <%
     PostDao dao = new PostDao();
     PostDto dto = new PostDto();

     dto.setPass("1");
     dto.setId(1); 
     
     out.println(dao.delete(dto));
     %> 
   </div>
   
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   session.invalidate(); // 서버에 있는 기록 삭제
   out.println("<script> alert('로그아웃 되었습니다.'); location.href='login.jsp'; </script>");
%>
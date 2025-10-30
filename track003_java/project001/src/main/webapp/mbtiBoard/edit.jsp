<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp"%>

<div class="container card  my-5">
	<h3 class="card-header">MBTI EDIT</h3>
	<form action="<%=request.getContextPath()%>/edit.do" method="post">
		<input type="hidden" name="app_user_id" value="">
		<div class="mb-3 mt-3">
			<label for="title" class="form-label">TITLE:</label> 
			<input type="email" class="form-control" id="title" placeholder="제목을 입력해 주세요." name="title" value="">
		</div>
		<div class="mb-3">
			<label for="pass" class="form-label">PASS:</label>
			<input type="password" class="form-control" id="pass" placeholder="비밀 번호를 입력해 주세요." name="pass">
		</div>
		<div class="mb-3">
			<label for="content" class="form-label">CONTENT:</label>
			<input type="password" class="form-control" id="content" placeholder="내용을 입력해 주세요." name="content">
		</div>
		<div class="d-flex justify-content-end gap-2 mb-3">
		<button type="submit" class="btn btn-primary">EDIT</button>
  <a href="<%=request.getContextPath()%>/list.do" class="btn btn-secondary">LIST</a>
  </div>
	</form>
</div>
<%@ include file="../inc/footer.jsp"%>
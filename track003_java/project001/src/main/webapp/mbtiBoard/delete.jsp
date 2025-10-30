<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp"%>

<div class="container card  my-5">
	<h3 class="card-header">MBTI DELETE</h3>
	<form action="<%=request.getContextPath()%>/delete.do" method="post">
		<input type="hidden" name="app_user_id" value="">
		<div class="my-3">
			<label for="pass" class="form-label">PASS:</label>
			<input type="password" class="form-control" id="pass" placeholder="비밀 번호를 입력해 주세요." name="pass">
		</div>
		<div class="d-flex justify-content-end gap-2 mb-3">
		<button type="submit" class="btn btn-primary">DELETE</button>
  <a href="<%=request.getContextPath()%>/list.do" class="btn btn-secondary">LIST</a>
  </div>
	</form>
</div>
<%@ include file="../inc/footer.jsp"%>
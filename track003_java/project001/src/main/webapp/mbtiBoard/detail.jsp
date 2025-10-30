<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp"%>

<div class="container card  my-5">
	<h3 class="card-header">MBTI DETAIL</h3>
	<div>
		<input type="hidden" name="app_user_id" value="">
		<div class="mb-3 mt-3">
			<label for="hit" class="form-label">조회수</label> 
			<input type="email" class="form-control" id="hit" name="hit" readonly value="">
		</div>
		<div class="mb-3 mt-3">
			<label for="title" class="form-label">TITLE:</label> 
			<input type="email" class="form-control" id="title" placeholder="제목을 입력해 주세요." name="title" readonly value="">
		</div>
		<div class="mb-3">
			<label for="content" class="form-label">CONTENT:</label>
			<input type="password" class="form-control" id="content" placeholder="내용을 입력해 주세요." readonly name="content">
		</div>
		<div class="d-flex justify-content-end gap-2 mb-3">
  <a href="<%=request.getContextPath()%>/editView.do" class="btn btn-secondary">EDIT</a>
  <a href="<%=request.getContextPath()%>/deleteView.do" class="btn btn-secondary">DELETE</a>
  <a href="<%=request.getContextPath()%>/list.do" class="btn btn-secondary">LIST</a>
</div>
	</div>
</div>
<%@ include file="../inc/footer.jsp"%>
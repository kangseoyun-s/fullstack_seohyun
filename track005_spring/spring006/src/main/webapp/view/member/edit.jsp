<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../inc/header.jsp"%>
<div class="container card mt-5">
	<h3 class="card-header">유저 정보 수정</h3>
	<form action="${pageContext.request.contextPath}/edit.users"
		method="post">
		<input type="hidden" name="appUserId" value="${dto.appUserId}">
		<div class="mb-3 mt-3">
			<label for="email" class="form-label">Email:</label> <input
				type="text" class="form-control" id="email"
				placehoder="이메일을 입력해 주세요." required name="email"
				value="${dto.email}" readonly>
		</div>
		<div class="mb-3">
			<label class="form-check-label" for="mbti">MBTI TYPE : </label> <select
				name="mbti_type_id" id="mbti" class="form-control">
				<option value="1">ISTJ</option>
				<option value="2">ISFJ</option>
				<option value="3">INFJ</option>
			</select>
<p><a href="${pageContext.request.contextPath}/login.users?appUserId=${dto.appUserId}" class="btn btn-danger">edit</a></p>
		</div>
	</form>
</div>
<%@ include file="../inc/footer.jsp"%>
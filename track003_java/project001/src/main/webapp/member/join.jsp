<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp"%>

<div class="container mt-5">
	<h3>WELCOME! 회원 가입</h3>
	<form action="join_process.jsp" method="post">
		<div class="mb-3 mt-3">
			<label for="email" class="form-label">Email:</label> <input
				type="email" class="form-control" id="email"
				placeholder="이메일을 입력해 주세요!" required name="email">
		</div>
		<div class="mb-3">
			<label for="pwd" class="form-label">Password:</label> <input
				type="password" class="form-control" id="pwd"
				placeholder="비밀번호를 입력해 주세요!" name="password">
		</div>
		<div class="mb-3">
			<label class="label" for="mbti">MBTI TYPE: </label>
			<select name="mbti_type_id" id="mbti">
			<option value="1">ENTP</option>
			<option value="2">INTP</option>
			<option value="3">ISTJ</option>
			</select>

		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
		<!--              action ="join_process.jsp"
           method ="post"
           name ="email", name="password" name="mbti_type_id"-->
	</form>
</div>


<%@ include file="../inc/footer.jsp"%>
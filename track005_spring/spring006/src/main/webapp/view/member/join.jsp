<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../inc/header.jsp"%>
<!-- 	header		 --> 
<div class="container mt-5">
	<h3>WELCOME! 회원가입</h3>
	<form action=""  method="post">
		<div class="mb-3 mt-3">
			<label  for="email" class="form-label">Email:</label> 
			<input  type="email" class="form-control" id="email"
					placeholder="이메일을 입력해주세요" required  name="email">
			<div class="iddouble_result"></div>
			<script>
			$(function(){
				// 1. 대상 찾아오기 아이디가 이메일의 값을 찾아오려고 함
				$("#email").on("keyup", function(){
					console.log($(this).val().trim())
					let keyword = $(this).val().trim();
					
					if(keyword === ""){ // 자료형까지 비교 // 만약 빈칸인지 검사
						$(".iddouble_result").empty().append("<span class='text-danger p-3'>이메일을 입력해 주세요.</span>");
						return;
					} else { // 아니라면 ajax
						$.ajax({
							url: "${pageContext.request.contextPath}/iddouble",
							type: "POST",
							data: {email:keyword},
							success:function(res){ // res
								console.log(res);
							if(res.cnt==1){ // 값만 비교
								$(".iddouble_result").empty().append("<span class='text-danger p-3'>이미 사용 중인 이메일입니다.</span>");
							} else {
								$(".iddouble_result").empty().append("<span class='text-success p-3'>사용 가능한 이메일입니다.</span>")
							}
							},
							error:function(error){
								$(".iddouble_result").empty().append("<span class='text-danger p-3'>서버 요청 중 오류가 발생했습니다.</span>")
							}
						});
					}					
				});
			});
			</script>		
		</div>
		<div class="mb-3">
			<label for="password" class="form-label">PASSWORD:</label> 
			<input type="password" class="form-control" id="password"
					placeholder="비밀번호를 입력해주세요" name="password">
		</div>
		<div class="mb-3">
			<label class="form-check-label"  for="mbti">MBTI TYPE: </label>  
			<select   name="mbti_type_id"  id="mbti"  class="form-control">
				<option value="1">ISTJ</option>
				<option value="2">ISFJ</option>
				<option value="3">INFJ</option>
			</select>
			
		</div>
		<button type="submit" class="btn btn-primary">회원가입</button>
	</form>
</div>
<!-- ctrl + shift + f -->
<!-- 	footer		 --> 
<%@ include file="../inc/footer.jsp"%>





	
<!-- 				
	action="join_process.jsp"
	method="post"
	name="email"   name="password"  name="mbti_type_id" 
-->

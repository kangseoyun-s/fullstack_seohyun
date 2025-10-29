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
		<h3 class="card-header">RESPONSE</h3>
		<pre>
      1. sendRedirect- 브라우저 url 변경 / request, response 유지 X
      2. RequsetDispatcher() - 경로가 숨겨짐 / request, response 유지 O
      </pre>
		<pre class="alert alert-warning">
      1. Servlet - DeptWhat
      2. form - 부서 번호 입력받기
      3. DeptWhat 사용자 정보 받아오기 (dispatcher)
      
      [필요 파일]
      1. Dto(전달용) - DeptDto
      2. Dao 서블릿에서 처리 DeptWhat
      3. form - action, method, name
      4. jsp010_result.jsp
      </pre>
		<form action="<%=request.getContextPath()%>/DeptWhat" method="get">
			<div class="mb-3 mt-3">
				<label for="deptno" class="form-label">부서 번호 입력</label> <input
					type="number" class="form-control" id="deptno" min="10" max="40" step="10"
					placeholder="부서 번호 입력:" name="deptno">
			</div>
			<button type="submit" class="btn btn-primary">부서 검색</button>
		</form>
	</div>
</body>
</html>
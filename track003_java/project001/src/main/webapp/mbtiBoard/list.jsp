<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp"%>

   <div class="container card  my-5">
		<h3 class="card-header">MBTI BOARD</h3>
		<!-- 향상된 for <c:forEach var="변수명" items="서버에서 넘겨받은 값" varStatus="status">
		</c:forEach>  -->
		<table class="table table-striped table-bordered table-hover">
			<caption>mbti</caption>
			<thead>
				<tr>
					<th scope="col">NO</th>
					<th scope="col">TITLE</th>
					<th scope="col">NAME</th>
					<th scope="col">DATE</th>
					<th scope="col">HIT</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="dto" items="${list}" varStatus="status">
			<tr>
			 <td>${list.size() - status.index}</td>
			 <td>
			 <a href="<%=request.getContextPath()%>/detail.do">${dto.title}</td>
			 <td>${dto.email}</td>
			 <td>${dto.createdAt}</td>
			 <td>${dto.hit}</td>
     		</tr>
		</c:forEach>
			</tbody>
		</table>
<div class="d-flex justify-content-end gap-2 mb-3">
  <a href="<%=request.getContextPath()%>/writeView.do" class="btn btn-secondary">WRITE</a>
  <a href="<%=request.getContextPath()%>/list.do" class="btn btn-secondary">LIST</a>
  <a href="javascript:history.go(-1)" class="btn btn-secondary">BACK</a>
</div>
		
	</div>
	
<%@ include file="../inc/footer.jsp"%>

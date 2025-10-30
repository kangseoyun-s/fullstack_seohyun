<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp"%>

<form action="<%=request.getContextPath()%>/write.do" method="post">
  <input type="hidden" name="app_user_id" value="1"><%-- 임시값 --%>

  <div class="mb-3 mt-3">
    <label for="title" class="form-label">TITLE:</label>
    <input type="text" class="form-control" id="title"
           placeholder="제목을 입력해 주세요." name="title">
  </div>

  <div class="mb-3">
    <label for="pass" class="form-label">PASS:</label>
    <input type="password" class="form-control" id="pass"
           placeholder="비밀 번호를 입력해 주세요." name="pass">
  </div>

  <div class="mb-3">
    <label for="content" class="form-label">CONTENT:</label>
    <textarea class="form-control" id="content" name="content" rows="5"
              placeholder="내용을 입력해 주세요."></textarea>
  </div>

  <div class="mb-3 text-end d-flex justify-content-end gap-2">
    <button type="submit" class="btn btn-primary">WRITE</button>
    <a href="<%=request.getContextPath()%>/list.do" class="btn btn-secondary">LIST</a>
  </div>
</form>

<%@ include file="../inc/footer.jsp"%>
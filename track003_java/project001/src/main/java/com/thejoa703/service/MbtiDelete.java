package com.thejoa703.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thejoa703.dao.PostDao;
import com.thejoa703.dto.PostDto;

public class MbtiDelete implements MbtiService {
	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String pass = request.getParameter("pass");
		int id = Integer.parseInt(request.getParameter("id"));
		PostDao dao = new PostDao();
	    PostDto dto = new PostDto();
	    dto.setPass(pass);
	    dto.setId(id);
	    request.setAttribute("id", id);
	    request.setAttribute("result", String.valueOf(dao.delete(dto)));
	}

}

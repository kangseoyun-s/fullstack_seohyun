package com.company.jsp009Servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletBasic3_LifeCycle
 */
@WebServlet("/ServletBasic3_LifeCycle")
public class ServletBasic3_LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	int initCnt = 1; // init 맨 처음 한 번만
	int doGetCnt = 1; // Thread - get/post
	int destoryCnt = 1; // destory 맨마지막 한 번만
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletBasic3_LifeCycle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("#1. init() 첫 요청에만 호출 > " + initCnt++);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("#2. destory() 첫 요청에만 호출 > " + destoryCnt++);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Good day :3").append(request.getContextPath());
		System.out.println("#2. ♠ 호출될 때마다 재사용 > " + doGetCnt++);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

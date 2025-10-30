package com.thejoa703.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.thejoa703.dao.PostDao;
import com.thejoa703.dto.PostDto;

public class MbtiInsert implements MbtiService {
    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        // ✅ 세션에서 로그인한 사용자 ID 가져오기
        HttpSession session = request.getSession();
        int app_user_id = (Integer)session.getAttribute("APP_USER_ID");

        // ✅ 폼 데이터 받기
        String title   = request.getParameter("title");
        String content = request.getParameter("content");
        String pass    = request.getParameter("pass");

        System.out.println("app_user_id = " + app_user_id);
        System.out.println("title = " + title);
        System.out.println("content = " + content);
        System.out.println("pass = " + pass);

        // ✅ DTO에 값 채우기
        PostDto dto = new PostDto();
        dto.setAppUserId(app_user_id);   // <-- 여기 핵심 수정
        dto.setTitle(title);
        dto.setContent(content);
        dto.setPass(pass);

        // ✅ DB insert
        PostDao dao = new PostDao();
        String result = String.valueOf(dao.insert(dto));

        // ✅ 결과 저장
        request.setAttribute("result", result);
    }
}

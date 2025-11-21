package com.thejoa703.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thejoa703.dto.UserDto;
import com.thejoa703.service.UserService;

@Controller
public class UserController {
	@Autowired UserService service;
	
	@RequestMapping("/list.users")
	public String list(Model model) {
		model.addAttribute("list", service.selectAll());
		return "member/list";
	}
	@RequestMapping(value="/join.users", method=RequestMethod.GET)
	public String join_get() {return "member/join";}
	
	@RequestMapping(value="/join.users", method=RequestMethod.POST)
	public String join_post(UserDto dto, RedirectAttributes rttr) {
		String result = "회원 가입 실패";
	    if(service.insert(dto)>0) {result="회원 가입 성공";}
	    rttr.addFlashAttribute("success", result);
	    return "redirect:/login.users";
	}
	@RequestMapping("/login.users")
	public String login_get() {
		return "member/login";
	}
	@RequestMapping(value="/login.users", method=RequestMethod.POST)
	public String login_post(UserDto dto, HttpServletRequest request, RedirectAttributes rttr) {
		String result ="로그인 실패";
		if(service.selectLogin(dto)==1) {
			HttpSession session = request.getSession();
			session.setAttribute("email", dto.getEmail());
			result ="로그인 성공";
		}
		rttr.addFlashAttribute("success", result);
		return "redirect:/mypage.users";
	}
	@RequestMapping("/mypage.users")
	public String mypage(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		String email = (String)session.getAttribute("email");
		model.addAttribute("dto", service.selectEmail(email));
		return "member/mypage";
	}
	@RequestMapping("/logout.users")
	public String mypage(HttpServletRequest request, RedirectAttributes rttr) {
		HttpSession session = request.getSession();
		rttr.addFlashAttribute("success", "로그아웃 되었습니다.");
		session.invalidate();
		return "redirect:/login.users";
	}
	@RequestMapping("/edit.users")
	public String edit_get(int appUserId, Model model) {
		model.addAttribute("dto", service.select(appUserId));
		return "member/edit";
	}
	@RequestMapping(value="/edit.users",  method=RequestMethod.POST)
	public String edit_post(UserDto dto, RedirectAttributes rttr) {
		String result = "비밀 번호를 확인해 주세요.";
		if(service.update(dto)>0) {result="수정 성공";}
		rttr.addFlashAttribute("success", result);
		return "redirect:/mypage.users";
	}
	@RequestMapping("/delete.users")
	public String delete_get() {
		return "member/delete";
	}
	@RequestMapping(value="/delete.users", method=RequestMethod.POST)
	public String delete_post(UserDto dto, RedirectAttributes rttr, HttpServletRequest request) {
		String result = "비밀 번호를 확인해 주세요.";
		if(service.delete(dto)>0) {
			result = "탈퇴 성공";
			HttpSession session = request.getSession();
			session.invalidate();
		}
		rttr.addFlashAttribute("success", result);
		return "redirect:/login.users";
	}
}

package cafe.jjdev.mall.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cafe.jjdev.mall.admin.service.MemberService;
import cafe.jjdev.mall.admin.vo.Member;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	// 로그인 폼
	@GetMapping(value="/member/login")
	public String getMember(HttpSession session) {
		if(session.getAttribute("memberLogin") != null) {
			return "redirect:/";
		}else {
			
		}
		return "/member/login";
	}
	//로그인 액션
	@PostMapping(value="/member/login")
	public String getMember(Model model, HttpSession session, Member member) {
		Member memberLogin = memberService.getMember(member);
		System.out.println(memberLogin+ "memberLogin");
		// 문자열 consumer은 .equals
		if(memberLogin == null || memberLogin.getMemberLevel().equals("consumer")) {
			return "redirect:/member/login";
		}else {
			session.setAttribute("memberLogin", memberLogin);
			model.addAttribute("memberLogin", memberLogin);
			System.out.println(model+"model");
			return "redirect:/";
		}
	}
	//로그아웃
	@GetMapping(value="/member/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	//회원가입 폼
	@GetMapping(value="/member/addMember")
	public String addMember() {
		return "/member/addMember";
	}
	//회원가입 액션
	@PostMapping(value="/member/addMember")
	public String addMember(Member member) {
		memberService.addMember(member);
		return "redirect:/";
	}
}

package iducs.spring.boot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QnaBoardController {
	@RequestMapping("/")
	public String home() {
		return "welcome";
	}
	@RequestMapping("/create")
	public String create(String name, Model model) {
		// name : 매개변수 이름과 일치해야하고, name에 매개변수 값이 저장됨
		System.out.println(name);
		model.addAttribute("my", name);
		return "create";
	}
	@RequestMapping("/list")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		model.addAttribute("my", request.getParameter("name"));
		return "hello";
	}
}

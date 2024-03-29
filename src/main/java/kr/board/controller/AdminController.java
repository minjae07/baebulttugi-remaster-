package kr.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping
	public RedirectView viewAdmin(Model model) {
		return new RedirectView("/admin/category");
	}
	
	@GetMapping("/category")
	public String viewCategory(Model model) {
		// View attribute
		model.addAttribute("template", "admin/category");
		return "admin/index";
	}
	
	@GetMapping("/users")
	public String viewAccount(Model model) {
		// View attribute
		model.addAttribute("template", "admin/users");
		return "admin/index";
	}
}
	

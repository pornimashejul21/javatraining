package com.example.DemoSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MyController {

	@GetMapping("/main")
	public String mainPage(@RequestParam String uname,Model model) {
		model.addAttribute("uname", uname);
		return "main";
	}
	@GetMapping("/movie")
	public String moviePage(@RequestParam String uname,Model model) {
		model.addAttribute("uname", uname);
		return "movie";
	}
	@GetMapping("/sport")
	public String sportPage(@RequestParam String uname,Model model) {
		model.addAttribute("uname", uname);
		return "sport";
	}
	
	
}
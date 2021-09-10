package com.example.htmltest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HtmlController {

	@GetMapping("/home")
	public String home(@RequestParam(name="name", required=false, defaultValue="home") String name, Model model) {
		model.addAttribute("name", name);
		return "home";
	}
	@GetMapping("/about")
	public String about(@RequestParam(name="name", required=false, defaultValue="about") String name, Model model) {
		model.addAttribute("name", name);
		return "about";
	}
	
	@GetMapping("/teamlinks")
	public String team(@RequestParam(name="name", required=false, defaultValue="team") String name, Model model) {
		model.addAttribute("name", name);
		return "team";
	}
	
	@GetMapping("/testchart")
	public String chart(@RequestParam(name="name", required=false, defaultValue="chart") String name, Model model) {
		model.addAttribute("name", name);
		return "chart";
	}

	@GetMapping("/downloads")
	public String download(@RequestParam(name="name", required=false, defaultValue="download") String name, Model model) {
		model.addAttribute("name", name);
		return "download";
	}

}
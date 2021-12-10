package co.seop.springpjt;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@RequestMapping("/home.do")
	public String home(Model model) {
		return "home/home";
	}
	
	@RequestMapping("/buttons.do")
	public String button(Model medel) {
		return "home/bb";
	}
	
}

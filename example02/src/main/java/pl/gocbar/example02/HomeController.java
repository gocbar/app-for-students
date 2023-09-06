package pl.gocbar.example02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String goToIndexPage() {
		return "index";
	}
}

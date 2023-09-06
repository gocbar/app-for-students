package pl.gocbar.example01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String goToIndexPage() {
		return "index";
	}
}

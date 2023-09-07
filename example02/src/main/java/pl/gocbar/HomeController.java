package pl.gocbar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String goToIndexPage() {
		return "home";
	}
	
	@GetMapping("/invitate")
	public String goToInvitationPage() {
		return "invitation";
	}
}

package springboot.stg;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/hai")
	public String hello(){
		return "Hello!";
	}
	
	
}

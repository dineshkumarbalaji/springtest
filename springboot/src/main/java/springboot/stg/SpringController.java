package springboot.stg;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController {
	
	@RequestMapping("/index")
	public String index(){
		return "index"; 
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute User user){
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("User-Data");
		modelAndView.addObject(user);
		return modelAndView;
		
	}
}

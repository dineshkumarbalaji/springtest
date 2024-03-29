package springboot.stg;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	  @RequestMapping("/")  
	    public List<UserRecord> getAllUser(){  
	        return userService.getAllUsers();  
	    }     
	    @RequestMapping(value="/add-user", method=RequestMethod.POST)  
	    public void addUser(@ModelAttribute("") UserRecord userRecord,HttpServletRequest request){  
	        userService.addUser(userRecord);  
	    }  
	    @RequestMapping(value="/user/{id}", method=RequestMethod.GET)  
	    public UserRecord getUser(@PathVariable String id){  
	        return userService.getUser(id);  
	    }  
}

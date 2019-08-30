package springboot.stg;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;  
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<UserRecord> getAllUsers(){
		List<UserRecord> userRecords = new ArrayList<>();
		userRepository.findAll().forEach(userRecords::add);
		return userRecords;
	}
	
	
	
	public UserRecord getUser(String id){  
        return userRepository.findOne(id);  
    }  
    public void addUser(UserRecord userRecord){  
    	System.out.println(userRecord.toString());
        userRepository.save(userRecord);  
    }  
    public void delete(String id){  
        userRepository.delete(id);  
    }  
}

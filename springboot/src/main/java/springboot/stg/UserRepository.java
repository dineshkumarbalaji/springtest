package springboot.stg;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<UserRecord, String>{

}

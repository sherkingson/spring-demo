package springjdbc;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


public interface MybatisDao {
	@Select("select * from testjdbc where first_name=#{firstName}")
	public User getUser(String firstName);
	
	
	public List<User> getUserList();

}

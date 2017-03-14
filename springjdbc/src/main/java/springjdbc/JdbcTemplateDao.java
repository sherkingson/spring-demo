package springjdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTemplateDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void createTable(){
		jdbcTemplate.execute("create table testjdbc(id integer,first_name varchar(100),last_name varchar(100))");
	}
	
	public void insertData(){
		this.jdbcTemplate.update("insert into testjdbc values(1,?,?)","Meimei","Han");
		this.jdbcTemplate.update("insert into testjdbc values(2,?,?)","Lei","Li");
	}
	
	
	public int count() {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForObject("select count(*) from testjdbc", Integer.class);
	}
}

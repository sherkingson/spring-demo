package mybatis;

public class User {
	private int id;
	private String name;
	private String school;
	
	public User(int id, String name, String school) {
		this.id = id;
		this.name = name;
		this.school = school;
	}
	
	public User(String name, String school) {
		this.name = name;
		this.school = school;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
	

}

package mybatis;

public interface GetUserInfo {
	
	public User getUser(int id);
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(int id);
	
	
}

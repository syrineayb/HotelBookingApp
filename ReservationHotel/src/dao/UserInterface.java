package dao;

import java.util.List;

import model.User;

public interface UserInterface {
	
		public List<User> getAll();
		public void addUser(User User);
		public User findUser(int id);
		public boolean updateUser(User user);
		public boolean deleteUser(int id);
		
	
}

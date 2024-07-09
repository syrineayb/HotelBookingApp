package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.User;
import model.User;

public class UserDAO implements UserInterface{

	@Override
	public List<User> getAll() {
		 try {
	            Connection cnx = dbc.createConnection();
	            PreparedStatement stmt = cnx.prepareStatement("SELECT * FROM user");
	            ResultSet rs = stmt.executeQuery();
	            ArrayList<User> Users = new ArrayList<>();
	            while (rs.next()) {
	                int UserId = rs.getInt("User_id");
	                String firstName = rs.getString("first_name");
	                String lastName = rs.getString("last_name");
	                String dateBirth = rs.getString("date_birth");
	                String email = rs.getString("email");
	                String password = rs.getString("password");
	                String gender = rs.getString("city");
	                String city = rs.getString("gender");
	                String role = rs.getString("role");
	                String profilePicture = rs.getString("profile_picture");

	                

	                User User = new User(UserId, firstName, lastName,email,password, gender,
	            	dateBirth, city, role, profilePicture);
	                Users.add(User);
	            }
	            return Users;
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	}

	@Override
	public void addUser(User User) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}

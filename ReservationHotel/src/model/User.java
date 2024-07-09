package model;

public class User {
	private int user_id;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private String gender;
	private String  date_birth;
	private String city;
	private String role;
	private String profile_picture;
	
	
	public User(int user_id, String first_name, String last_name, String email, String password, String gender,
			String date_birth, String city, String role, String profile_picture) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.date_birth = date_birth;
		this.city = city;
		this.role = role;
		this.profile_picture = profile_picture;
	}
	
	public User(String first_name, String last_name, String email, String password, String gender, String date_birth,
			String city, String role, String profile_picture) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.date_birth = date_birth;
		this.city = city;
		this.role = role;
		this.profile_picture = profile_picture;
	}

	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDate_birth() {
		return date_birth;
	}
	public void setDate_birth(String date_birth) {
		this.date_birth = date_birth;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getProfile_picture() {
		return profile_picture;
	}
	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + ", password=" + password + ", gender=" + gender + ", date_birth=" + date_birth + ", city="
				+ city + ", role=" + role + ", profile_picture=" + profile_picture + "]";
	}
	
	
}

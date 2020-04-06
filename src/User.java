
public class User {
private int ID;
private String first_name;
private String last_name;
private String email;
private int age;
private String dateofbirth;
private String Username;
private String password;


public User()
{
	this.ID = 1;
	this.first_name ="stupid";
	this.last_name = "really stupid";
	this.email = "not yet";
	this.age = 12;
	this.dateofbirth = "youre not born yet";
	this.Username = "no user name yet";
	this.password= "no password yet";
}
public User(int ID, String first_name, String last_name, String email, int age, String dateofbirth, String Username, String password) {
	this.ID = ID;
	this.first_name = first_name;
	this.last_name = last_name;
	this.email = email;
	this.age = age;
	this.dateofbirth = dateofbirth;	
	this.Username = Username;
	this.password = password;
}

@Override
public String toString() {
	return "User [ID=" + ID + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + ", age="
			+ age + ", dateofbirth=" + dateofbirth + ", Username=" + Username + ", password=" + password + "]";
}
public String getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(String dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}

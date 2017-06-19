package Beans;

public class Employee {

	public String userName;
	public String fullNames;
	public String dob;
	public String roles;
	public double salary;
	public String profession;
	
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullNames() {
		return fullNames;
	}
	public void setFullNames(String fullNames) {
		this.fullNames = fullNames;
	}

	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public void showUser()
	{
		System.out.println("Full Names: " + getFullNames());
		System.out.println("UserName: " + getUserName());
		System.out.println("Profession: " + getProfession());
	}
	
	public void destroy()
	{
		fullNames = null;
		userName = null;
		profession = null;
		
		System.out.println("User info destroyed");
	}

	
	
	
}

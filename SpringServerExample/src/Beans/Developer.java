package Beans;

public class Developer extends Employee{
	
	
	public int codingLanguages;
	public String codingExperience;
	
	public String userName;
	public String fullNames;
	public String dob;
	public String roles;
	public double salary;
	public String profession;
	
	
	
	public int getCodingLanguages() {
		return codingLanguages;
	}
	public void setCodingLanguages(int codingLanguages) {
		this.codingLanguages = codingLanguages;
	}
	public String getCodingExperience() {
		return codingExperience;
	}
	public void setCodingExperience(String codingExperience) {
		this.codingExperience = codingExperience;
	}

	public void showUser()
	{
		System.out.println("Full Names: " + getFullNames());
		System.out.println("UserName: " + getUserName());
		System.out.println("Profession: " + getProfession());
		
		calculateSalaryBasedOnExperience();
		calculateSalaryBasedOnLanguagesKnown();
		System.out.println("programming Languages: " + codingLanguages);
		System.out.println("Programming Expeience: " + codingExperience);
		System.out.println("Remuneration: " + salary);
		
	}
	
	public void calculateSalaryBasedOnLanguagesKnown()
	{
		
		switch(codingLanguages)
		{
		case 1:
			break;
		case 2:
			salary += 1000;
			break;
		case 3:
			salary += 2000;
			break;
		case 4:
			salary += 3500;
			break;
		case 5:
			salary += 5000;
			break;
			default:
				salary += 5500;
		
		}
		
	}
	
	public void calculateSalaryBasedOnExperience()
	{
		
		if(codingExperience.equalsIgnoreCase("Graduate"))
		{			
			salary = 8000;
		}
			
		else if(codingExperience.equalsIgnoreCase("Junior"))
		{
			salary = 15000;
		}
		else if(codingExperience.equalsIgnoreCase("Intermediate"))
		{
			salary = 30000;			
		}
		else if(codingExperience.equalsIgnoreCase("Senior"))
		{			
			salary = 40000;
		}
				
	}
	
	public void destroy()
	{
		fullNames = null;
		userName = null;
		profession = null;
		
		System.out.println("User info destroyed");
	}


}

package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Beans.Developer;
import Beans.Employee;
import Beans.LanguagesCollection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("Beans.xml");
		
		
		//showEmployee(context);
		//showDeveloper(context);
		showLanguagesAvailable(context);
		
		
		context.registerShutdownHook();
			
		
	}
	
	
	private static void showEmployee(ApplicationContext context)
	{
		
		Employee employee = (Employee) context.getBean("employee");
		
		System.out.println("<<<<<<ADMIN USER DETAILS>>>>>>>");
		employee.showUser();
		System.out.println();
		
		
	}
	
	private static void showLanguagesAvailable(ApplicationContext context)
	{
	
		System.out.println("<<<<<<PROGRAMMING LANGUAGES>>>>>>>");
		LanguagesCollection collection = (LanguagesCollection) context.getBean("languagesCollection");
		collection.displayLanguages();
		
				
	}
	
	
	private static void showDeveloper(ApplicationContext context)
	{
		
		Developer developer = (Developer) context.getBean("developer01");
		
		
		System.out.println("<<<<<<DEVELOPER USER DETAILS>>>>>>>");
		developer.showUser();
		System.out.println();

		
		
		
	}


}

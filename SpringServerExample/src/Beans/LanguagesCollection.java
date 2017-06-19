package Beans;

import java.util.Set;

public class LanguagesCollection {

	
	Set languagesSet;
	
	

	public Set getLanguagesSet() {
		return languagesSet;
	}

	public void setLanguagesSet(Set languagesSet) {
		this.languagesSet = languagesSet;
	}
	
	public void displayLanguages()
	{
		
		for(Object entry: languagesSet)
		{
			String word = (String)entry;
			System.out.println("Language: " + word);
		}
		
	}
	
	
	
	
}

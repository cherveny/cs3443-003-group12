package MainPackage;

///// class to manage each skill and see if they have a selection option
public class skill {
	
	private boolean choice;
	private String skillName;
	
	public skill(String s) {
		skillName = s;
		choice = false;
	}
	
	public void setChoice() {
		choice = true;
	}
	
	public boolean hasChoice() {
		
		return choice;
	}
	
	public String getSkillName() {
		return skillName;
	}
	
	public void setSkillName(String s) {
		skillName = s;
	}
	
	public void setChoices(String className) {
		if (className.contains("Barbarian")) {
			
		}
	}
	
}
///     this class purpose is to create an array of the skills so that we can just change it from false to true if it 
///		is a selectable skill
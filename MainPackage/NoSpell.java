package MainPackage;

///  class to return an empty object of type spell if no spell is found
public class NoSpell extends Spell{
	  private int Level = -11;
	  
	  private String ClassRequirement[] = {""};
	  
	  private String Description = "No Spell Found";

	  
	  public NoSpell() {
	    
	  }
	  
	  //GETTERS//
	  public int getLevel()
	  {
	    return this.Level;
	  }
	  
	  public String[] getClassRequirement()
	  {
	    return this.ClassRequirement;
	  }
	  
	  public String getDescription()
	  {
	    return this.Description;
	  }

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}

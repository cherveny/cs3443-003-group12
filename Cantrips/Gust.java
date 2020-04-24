public class Gust extends Spell {
  
  private int Level = 0;
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Gust\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 30 ft\n"+
                       "Components: V,S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Transmutation\n"+
                       "Attack/Save: STR Save\n"+
                       "Damage/Effect: Control\n"+
                       "Description: You seize the air and compel it to create one of the following effects at a point you can see within range:\nOne Medium or smaller creature that you choose must succeed on a Strength saving throw or be pushed up to 5 feet away from you.\nYou create a small blast of air capable of moving one object that is neither held nor carried and that weighs no more than 5 pounds. The object is pushed up to 10 feet away from you. It isn’t pushed with enough force to cause damage.\nYou create a harmless sensory effect using air, such as causing leaves to rustle, wind to slam shutters shut, or your clothing to ripple in a breeze.";
  public Gust() {
    
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
}
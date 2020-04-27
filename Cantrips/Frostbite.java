public class Frostbite extends Spell {
  
  private int Level = 0;
  
  private String name = "Frostbite";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Frostbite\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 60 ft\n"+
                       "Components: V,S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Evocation\n"+
                       "Attack/Save: CON Save\n"+
                       "Damage/Effect: Cold\n"+
                       "Description: You cause numbing frost to form on one creature that you can see within range. The target must make a Constitution saving throw. On a failed save, the target takes 1d6 cold damage, and it has disadvantage on the next weapon attack roll it makes before the end of its next turn.\nThe spell’s damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).";
  public Frostbite() {
    
  }
  
  //GETTERS//
  public int getLevel()
  {
    return this.Level;
  }
    
  public String getName()
  {
    return name;
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

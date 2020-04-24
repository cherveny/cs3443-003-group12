public class PoisonSpray extends Spell {
  
  private int Level = 0;
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Poison Spray\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 10 ft\n"+
                       "Components: V,S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Conjuration\n"+
                       "Attack/Save: CON Save\n"+
                       "Damage/Effect: Poison\n"+
                       "Description: You extend your hand toward a creature you can see within range and project a puff of noxious gas from your palm. The creature must succeed on a Constitution saving throw or take 1d12 poison damage.\nThis spell's damage increases by 1d12 when you reach 5th level (2d12), 11th level (3d12), and 17th level (4d12).";
 
  public PoisonSpray() {
    
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
public class SpareTheDying extends Spell {
  
  private int Level = 0;
  
  private String name = "Spare The Dying";
  
  private String ClassRequirement[] = {"Cleric"};
  
  private String Description = "Spell: Spare The Dying\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: Toucht\n"+
                       "Components: V,S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Necromancy\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Healing\n"+
                       "Description: You touch a living creature that has 0 hit points. The creature becomes stable. This spell has no effect on undead or constructs.";
  public SpareTheDying() {
    
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
    
  public String getName()
  {
    return name;
  }
  
  public String getDescription()
  {
    return this.Description;
  }
}

public class Jump extends Spell {
  
  private int Level = 1;
  
  private String name = "Jump";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Jump\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: Touch\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 1 Min\n"+
                       "School: Transmutation\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Movement\n"+
                       "Description: You touch a creature. The creature's jump distance is tripled until the spell ends.";
  

  
  public Jump() {
    
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

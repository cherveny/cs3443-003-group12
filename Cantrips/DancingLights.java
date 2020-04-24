public class DancingLights extends Spell {
  
  private int Level = 0;
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Dancing Lights\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 120 ft\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 1 min\n"+
                       "School: Evocation\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Utility\n"+
                       "Description: You create up to four torch-sized lights within range, making them appear as torches, lanterns, or glowing orbs that hover in the air for the duration. You can also combine the four lights into one glowing vaguely humanoid form of Medium size. Whichever form you choose, each light sheds dim light in a 10-foot radius.\nAs a bonus action on your turn, you can move the lights up to 60 feet to a new spot within range. A light must be within 20 feet of another light created by this spell, and a light winks out if it exceeds the spell's range.";
  
  public DancingLights() {
    
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
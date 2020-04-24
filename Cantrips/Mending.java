public class Mending extends Spell {
  
  private int Level = 0;
  
  private String ClassRequirement[] = {"Wizard", "Cleric"};
  
  private String Description = "Spell: Mending\n"+
                       "Casting Time: 1 Minute\n"+
                       "Range/Area: Touch\n"+
                       "Components: V,S,M *\n"+
                       "Duration: Instantaneous\n"+
                       "School: Transmutation\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Utility\n"+
                       "Description: This spell repairs a single break or tear in an object you touch, such as a broken chain link, two halves of a broken key, a torn cloak, or a leaking wineskin. As long as the break or tear is no larger than 1 foot in any dimension, you mend it, leaving no trace of the former damage.\nThis spell can physically repair a magic item or construct, but the spell can't restore magic to such an object.";
  
  public Mending() {
    
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
public class MoldEarth extends Spell {
  
  private int Level = 0;
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Mold Earth\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 30 ft\n"+
                       "Components: S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Transmutation\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Control\n"+
                       "Description: You choose a portion of dirt or stone that you can see within range and that fits within a 5-foot cube. You manipulate it in one of the following ways:\nIf you target an area of loose earth, you can instantaneously excavate it, move it along the ground, and deposit it up to 5 feet away. This movement doesn’t have enough force to cause damage.\nYou cause shapes, colors, or both to appear on the dirt or stone, spelling out words, creating images, or shaping patterns. The changes last for 1 hour.\nIf the dirt or stone you target is on the ground, you cause it to become difficult terrain. Alternatively, you can cause the ground to become normal terrain if it is already difficult terrain. This change lasts for 1 hour.\n\nIf you cast this spell multiple times, you can have no more than two of its non-instantaneous effects active at a time, and you can dismiss such an effect as an action.";
  public MoldEarth() {
    
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
public class ShapeWater extends Spell {
  
  private int Level = 0;
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Shape Water\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 30 ft\n"+
                       "Components: S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Transmutation\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Control\n"+
                       "Description: You choose an area of water that you can see within range and that fits within a 5-foot cube. You manipulate it in one of the following ways:\nYou instantaneously move or otherwise change the flow of the water as you direct, up to 5 feet in any direction. This movement doesn’t have enough force to cause damage.\nYou cause the water to form into simple shapes and animate at your direction. This change lasts for 1 hour.\nYou change the water’s color or opacity. The water must be changed in the same way throughout. This change lasts for 1 hour.\nYou freeze the water, provided that there are no creatures in it. The water unfreezes in 1 hour.\n\nIf you cast this spell multiple times, you can have no more than two of its non-instantaneous effects active at a time, and you can dismiss such an effect as an action.";

    
  public ShapeWater() {
    
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
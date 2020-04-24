public class ShockingGrasp extends Spell {
  
  private int Level = 0;
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Shocking Grasp\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: Touch\n"+
                       "Components: V,S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Evocation\n"+
                       "Attack/Save: Melee\n"+
                       "Damage/Effect: Lightning\n"+
                       "Description: Lightning springs from your hand to deliver a shock to a creature you try to touch. Make a melee spell attack against the target. You have advantage on the attack roll if the target is wearing armor made of metal. On a hit, the target takes 1d8 lightning damage, and it can't take reactions until the start of its next turn.\nThe spell's damage increases by 1d8 when you reach 5th level (2d8), 11th level (3d8), and 17th level (4d8).";
    
  public ShockingGrasp() {
    
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
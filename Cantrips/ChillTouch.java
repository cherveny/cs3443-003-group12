public class ChillTouch extends Spell {
  
  private int Level = 0;
  
  private String name = "Chill Touch";
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Chill Touch\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 120 ft\n"+
                       "Components: V,S\n"+
                       "Duration: 1 Round\n"+
                       "School: Necromancy\n"+
                       "Attack/Save: Ranged\n"+
                       "Damage/Effect: Necrotic\n"+
                       "Description: You create a ghostly, skeletal hand in the space of a creature within range. Make a ranged spell attack against the creature to assail it with the chill of the grave. On a hit, the target takes 1d8 necrotic damage, and it can't regain hit points until the start of your next turn. Until then, the hand clings to the target.\nIf you hit an undead target, it also has disadvantage on attack rolls against you until the end of your next turn.\nThis spell's damage increases by 1d8 when you reach 5th level (2d8), 11th level (3d8), and 17th level (4d8).";
  public ChillTouch() {
    
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

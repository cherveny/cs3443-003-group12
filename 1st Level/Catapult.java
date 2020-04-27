public class Catapult extends Spell {
  
  private int Level = 1;
  
  private String name = "Catapult";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Catapult\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 60 ft\n"+
                       "Components: S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Transmutation\n"+
                       "Attack/Save: DEX Save\n"+
                       "Damage/Effect: Bludgeoning\n"+
                       "Description: Choose one object weighing 1 to 5 pounds within range that isn’t being worn or carried. The object flies in a straight line up to 90 feet in a direction you choose before falling to the ground, stopping early if it impacts against a solid surface. If the object would strike a creature, that creature must make a Dexterity saving throw. On a failed save, the object strikes the target and stops moving. When the object strikes something, the object and what it strikes each take 3d8 bludgeoning damage.\nAt Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the maximum weight of objects that you can target with this spell increases by 5 pounds, and the damage increases by 1d8, for each slot level above 1st.";
  

  
  public Catapult() {
    
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

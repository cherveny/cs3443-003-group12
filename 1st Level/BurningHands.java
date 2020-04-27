public class BurningHands extends Spell {
  
  private int Level = 1;
  
  private String name = "Burning Hands";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Burning Hands\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: Self\n"+
                       "Components: V,S\n"+
                       "Duration: Instantaneous\n"+
                       "School: Evocation\n"+
                       "Attack/Save: DEX Save\n"+
                       "Damage/Effect: Fire\n"+
                       "Description: As you hold your hands with thumbs touching and fingers spread, a thin sheet of flames shoots forth from your outstretched fingertips. Each creature in a 15-foot cone must make a Dexterity saving throw. A creature takes 3d6 fire damage on a failed save, or half as much damage on a successful one.\nThe fire ignites any flammable objects in the area that aren't being worn or carried.\nAt Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the damage increases by 1d6 for each slot level above 1st.";
  

  
  public BurningHands() {
    
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

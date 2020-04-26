public class GuidingBolt extends Spell {
  
  private int Level = 1;
  
  private String ClassRequirement[] = {"Cleric"};
  
  private String Description = "Spell: Guiding Bolt\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 120 ft\n"+
                       "Components: V,S\n"+
                       "Duration: 1 Round\n"+
                       "School: Evocation\n"+
                       "Attack/Save: Ranged\n"+
                       "Damage/Effect: Radiant\n"+
                       "Description: A flash of light streaks toward a creature of your choice within range. Make a ranged spell attack against the target. On a hit, the target takes 4d6 radiant damage, and the next attack roll made against this target before the end of your next turn has advantage, thanks to the mystical dim light glittering on the target until then.\nAt Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the damage increases by 1d6 for each slot level above 1st.";
  

  
  public GuidingBolt() {
    
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
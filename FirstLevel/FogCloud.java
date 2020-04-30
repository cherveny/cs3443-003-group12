package FirstLevel;

import MainPackage.Spell;

public class FogCloud extends Spell {
  
  private int Level = 1;
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String name = "Fog Cloud";
  
  private String Description = "Spell: Fog Cloud\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 120 ft\n"+
                       "Components: V,S\n"+
                       "Duration: 1 Hour\n"+
                       "School: Conjuration\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Control\n"+
                       "Description: You create a 20-foot-radius sphere of fog centered on a point within range. The sphere spreads around corners, and its area is heavily obscured. It lasts for the duration or until a wind of moderate or greater speed (at least 10 miles per hour) disperses it.\nAt Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the radius of the fog increases by 20 feet for each slot level above 1st.";
  

  
  public FogCloud() {
    
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

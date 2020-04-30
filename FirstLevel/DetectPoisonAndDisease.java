package FirstLevel;

import MainPackage.Spell;

public class DetectPoisonAndDisease extends Spell {
  
  private int Level = 1;
  
  private String name = "Detect Poison and Disease";
  
  private String ClassRequirement[] = {"Cleric"};
  
  private String Description = "Spell: Detect Poison and Disease\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: Self\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 10 Min\n"+
                       "School: Divination\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Detection\n"+
                       "Description: For the duration, you can sense the presence and location of poisons, poisonous creatures, and diseases within 30 feet of you. You also identify the kind of poison, poisonous creature, or disease in each case.\nThe spell can penetrate most barriers, but it is blocked by 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet of wood or dirt.";
  

  
  public DetectPoisonAndDisease() {
    
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

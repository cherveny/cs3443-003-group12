public class DetectMagic extends Spell {
  
  private int Level = 1;
  
  private String name = "Detect Magic";
  
  private String ClassRequirement[] = {"Cleric","Wizard"};
  
  private String Description = "Spell: Detect Magic\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: Self\n"+
                       "Components: V,S\n"+
                       "Duration: 10 Min\n"+
                       "School: Divination\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Detection\n"+
                       "Description: For the duration, you sense the presence of magic within 30 feet of you. If you sense magic in this way, you can use your action to see a faint aura around any visible creature or object in the area that bears magic, and you learn its school of magic, if any.\nThe spell can penetrate most barriers, but it is blocked by 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet of wood or dirt.";
  

  
  public DetectMagic() {
    
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

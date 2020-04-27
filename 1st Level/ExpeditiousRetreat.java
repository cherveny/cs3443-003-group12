public class ExpeditiousRetreat extends Spell {
  
  private int Level = 1;
  
  private String name = "Expeditious Retreat";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Expeditious Retreat\n"+
                       "Casting Time: 1 Bonus Action\n"+
                       "Range/Area: Self\n"+
                       "Components: V,S\n"+
                       "Duration: 10 Min\n"+
                       "School: Transmutation\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Movement\n"+
                       "Description: This spell allows you to move at an incredible pace. When you cast this spell, and then as a bonus action on each of your turns until the spell ends, you can take the Dash action.";
  

  
  public ExpeditiousRetreat() {
    
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

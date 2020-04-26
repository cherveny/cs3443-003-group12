public class Shield extends Spell {
  
  private int Level = 1;
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Shield\n"+
                       "Casting Time: 1 Reaction\n"+
                       "Range/Area: Self\n"+
                       "Components: V,S\n"+
                       "Duration: 1 Round\n"+
                       "School: Abjuration\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Warding\n"+
                       "Description: An invisible barrier of magical force appears and protects you. Until the start of your next turn, you have a +5 bonus to AC, including against the triggering attack, and you take no damage from magic missile.";
  

  
  public Shield() {
    
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
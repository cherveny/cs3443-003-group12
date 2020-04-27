public class MageArmor extends Spell {
  
  private int Level = 1;
  
  private String name = "Mage Armor";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Mage Armor\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: Touch\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 8 Hour\n"+
                       "School: Abjuration\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Buff\n"+
                       "Description: You touch a willing creature who isn't wearing armor, and a protective magical force surrounds it until the spell ends. The target's base AC becomes 13 + its Dexterity modifier. The spell ends if the target dons armor or if you dismiss the spell as an action.";
  

  
  public MageArmor() {
    
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

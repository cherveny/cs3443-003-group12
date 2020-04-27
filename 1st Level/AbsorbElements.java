public class AbsorbElements extends Spell {
  
  private int Level = 1;
  private String name = "Absorb Elements";
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Absorb Elements\n"+
                       "Casting Time: 1 Reaction\n"+
                       "Range/Area: Self\n"+
                       "Components: S\n"+
                       "Duration: 1 Round\n"+
                       "School: Abjuration\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Acid\n"+
                       "Description: The spell captures some of the incoming energy, lessening its effect on you and storing it for your next melee attack. You have resistance to the triggering damage type until the start of your next turn. Also, the first time you hit with a melee attack on your next turn, the target takes an extra 1d6 damage of the triggering type, and the spell ends.\nAt Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the extra damage increases by 1d6 for each slot level above 1st.";
  public AbsorbElements(){
    
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

public class TrueStrike extends Spell {
  
  private int Level = 0;
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: True Strike\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 30 ft\n"+
                       "Components: S\n"+
                       "Duration: 1 Round\n"+
                       "School: Divination\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Foreknowledge\n"+
                       "Description: You point a finger at a target in range. Your magic grants you a brief insight into the target's defenses. On your next turn, you gain advantage on your first attack roll against the target, provided that this spell hasn't ended.";
  public TrueStrike() {
    
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
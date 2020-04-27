public class Prestidigitation extends Spell {
  
  private int Level = 0;
  
  private String name = "Prestidigitation";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Prestidigitation\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 10 ft\n"+
                       "Components: V,S\n"+
                       "Duration: 1 hr\n"+
                       "School: Transmutation\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Utility\n"+
                       "Description: This spell is a minor magical trick that novice spellcasters use for practice. You create one of the following magical effects within range:\nYou create an instantaneous, harmless sensory effect, such as a shower of sparks, a puff of wind, faint musical notes, or an odd odor.\nYou instantaneously light or snuff out a candle, a torch, or a small campfire.\nYou instantaneously clean or soil an object no larger than 1 cubic foot.\nYou chill, warm, or flavor up to 1 cubic foot of nonliving material for 1 hour.\nYou make a color, a small mark, or a symbol appear on an object or a surface for 1 hour.\nYou create a nonmagical trinket or an illusory image that can fit in your hand and that lasts until the end of your next turn.\n\nIf you cast this spell multiple times, you can have up to three of its non-instantaneous effects active at a time, and you can dismiss such an effect as an action.";
  
  public Prestidigitation() {
    
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

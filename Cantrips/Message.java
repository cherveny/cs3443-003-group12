public class Message extends Spell {
  
  private int Level = 0;
  
  private String name = "Message";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Message\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 120 ft\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 1 Round\n"+
                       "School: Transmutation\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Communication\n"+
                       "Description: You point your finger toward a creature within range and whisper a message. The target (and only the target) hears the message and can reply in a whisper that only you can hear.\nYou can cast this spell through solid objects if you are familiar with the target and know it is beyond the barrier. Magical silence, 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet of wood blocks the spell. The spell doesn't have to follow a straight line and can travel freely around corners or through openings.";
  
  public Message() {
    
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

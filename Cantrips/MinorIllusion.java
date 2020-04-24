public class MinorIllusion extends Spell {
  
  private int Level = 0;
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Minor Illusion\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 30 ft\n"+
                       "Components: S,M *\n"+
                       "Duration: 1 min\n"+
                       "School: Illusion\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Control\n"+
                       "Description: You create a sound or an image of an object within range that lasts for the duration. The illusion also ends if you dismiss it as an action or cast this spell again.\nIf you create a sound, its volume can range from a whisper to a scream. It can be your voice, someone else's voice, a lion's roar, a beating of drums, or any other sound you choose. The sound continues unabated throughout the duration, or you can make discrete sounds at different times before the spell ends.\nIf you create an image of an object--such as a chair, muddy footprints, or a small chest--it must be no larger than a 5-foot cube. The image can't create sound, light, smell, or any other sensory effect. Physical interaction with the image reveals it to be an illusion, because things can pass through it.\nIf a creature uses its action to examine the sound or image, the creature can determine that it is an illusion with a successful Intelligence (Investigation) check against your spell save DC. If a creature discerns the illusion for what it is, the illusion becomes faint to the creature.";
  
  public MinorIllusion() {
    
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
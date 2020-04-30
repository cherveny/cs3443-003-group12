package FirstLevel;

import MainPackage.Spell;

public class IllusoryScript extends Spell {
  
  private int Level = 1;
  
  private String name = "Illusory Script";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Illusory Script\n"+
                       "Casting Time: 1 Min\n"+
                       "Range/Area: Touch\n"+
                       "Components: S,M *\n"+
                       "Duration: 10 Days\n"+
                       "School: Illusion\n"+
                       "Attack/Save: None\n"+
                       "Damage/Effect: Communication\n"+
                       "Description: You write on parchment, paper, or some other suitable writing material and imbue it with a potent illusion that lasts for the duration.\nTo you and any creatures you designate when you cast the spell, the writing appears normal, written in your hand, and conveys whatever meaning you intended when you wrote the text. To all others, the writing appears as if it were written in an unknown or magical script that is unintelligible. Alternatively, you can cause the writing to appear to be an entirely different message, written in a different hand and language, though the language must be one you know.\nShould the spell be dispelled, the original script and the illusion both disappear.\nA creature with truesight can read the hidden message.";
  

  
  public IllusoryScript() {
    
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

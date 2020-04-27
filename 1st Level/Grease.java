public class Grease extends Spell {
  
  private int Level = 1;
  
  private String name = "Grease";
  
  private String ClassRequirement[] = {"Wizard"};
  
  private String Description = "Spell: Grease\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 60 ft\n"+
                       "Components: V,S,M *\n"+
                       "Duration: 1 Min\n"+
                       "School: Conjuration\n"+
                       "Attack/Save: DEX Save\n"+
                       "Damage/Effect: Prone\n"+
                       "Description: Slick grease covers the ground in a 10-foot square centered on a point within range and turns it into difficult terrain for the duration.\nWhen the grease appears, each creature standing in its area must succeed on a Dexterity saving throw or fall prone. A creature that enters the area or ends its turn there must also succeed on a Dexterity saving throw or fall prone.";
  

  
  public Grease() {
    
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

public class Command extends Spell {
  
  private int Level = 1;
  
  private String name = "Command";
  
  private String ClassRequirement[] = {"Cleric"};
  
  private String Description = "Spell: Command\n"+
                       "Casting Time: 1 Action\n"+
                       "Range/Area: 60 ft\n"+
                       "Components: V\n"+
                       "Duration: 1 Round\n"+
                       "School: Enchantment\n"+
                       "Attack/Save: WIS Save\n"+
                       "Damage/Effect: Prone\n"+
                       "Description: You speak a one-word command to a creature you can see within range. The target must succeed on a Wisdom saving throw or follow the command on its next turn. The spell has no effect if the target is undead, if it doesn't understand your language, or if your command is directly harmful to it.\nSome typical commands and their effects follow. You might issue a command other than one described here. If you do so, the GM determines how the target behaves. If the target can't follow your command, the spell ends.\nApproach. The target moves toward you by the shortest and most direct route, ending its turn if it moves within 5 feet of you.\nDrop. The target drops whatever it is holding and then ends its turn.\nFlee. The target spends its turn moving away from you by the fastest available means.\nGrovel. The target falls prone and then ends its turn.\nHalt. The target doesn't move and takes no actions. A flying creature stays aloft, provided that it is able to do so. If it must move to stay aloft, it flies the minimum distance needed to remain in the air.\nAt Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, you can affect one additional creature for each slot level above 1st. The creatures must be within 30 feet of each other when you target them.";
  

  
  public Command() {
    
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

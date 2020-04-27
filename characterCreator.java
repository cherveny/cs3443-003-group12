public class characterCreator {
// driver for testing CharacterClass

    public static void main(String args[])
    {
        CharacterClass cc = new CharacterClass();
        System.out.println("begin");
        System.out.println(cc.listClasses());

        try {
            System.out.println(cc.getDescription("Barbarian"));
//            cc.chooseCharacterClass("Kumquat");
            cc.chooseCharacterClass("Barbarian");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        //System.out.println(cc.getRages()[2]);

        try {
            System.out.println(cc.getDescription("Cleric"));
//            cc.chooseCharacterClass("Kumquat");
            cc.chooseCharacterClass("Cleric");
            System.out.println(cc.getDescription("Wizard"));
//            cc.chooseCharacterClass("Kumquat");
            cc.chooseCharacterClass("Wizard");
            System.out.println(cc.getDescription("Rogue"));
//            cc.chooseCharacterClass("Kumquat");
            cc.chooseCharacterClass("Rogue");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}

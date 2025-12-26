public class CommandTest {
    public static void main(String[] args) {
        testConstructor();
        testGetCommandWord();
        testGetSecondWord();
        testIsUnknown();
        testHasSecondWord();
        System.out.println("All Command tests completed.");
    }
    
    public static void testConstructor() {
        Command cmd = new Command("go", "north");
        if (!"go".equals(cmd.getCommandWord()) || !"north".equals(cmd.getSecondWord())) {
            System.out.println("testConstructor failed");
        } else {
            System.out.println("testConstructor passed");
        }
    }
    
    public static void testGetCommandWord() {
        Command cmd = new Command("quit", null);
        if (!"quit".equals(cmd.getCommandWord())) {
            System.out.println("testGetCommandWord failed");
        } else {
            System.out.println("testGetCommandWord passed");
        }
    }
    
    public static void testGetSecondWord() {
        Command cmd = new Command("take", "key");
        if (!"key".equals(cmd.getSecondWord())) {
            System.out.println("testGetSecondWord failed");
        } else {
            System.out.println("testGetSecondWord passed");
        }
    }
    
    public static void testIsUnknown() {
        Command cmd1 = new Command(null, "something");
        Command cmd2 = new Command("help", null);
        if (!cmd1.isUnknown() || cmd2.isUnknown()) {
            System.out.println("testIsUnknown failed");
        } else {
            System.out.println("testIsUnknown passed");
        }
    }
    
    public static void testHasSecondWord() {
        Command cmd1 = new Command("go", "east");
        Command cmd2 = new Command("look", null);
        if (!cmd1.hasSecondWord() || cmd2.hasSecondWord()) {
            System.out.println("testHasSecondWord failed");
        } else {
            System.out.println("testHasSecondWord passed");
        }
    }
}
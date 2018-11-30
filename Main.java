import java.util.Scanner;

public class Main {
    public static int room = 0;
    public static boolean hasMatch = false;
    public static boolean hasPen = false;
    public static boolean timbre = false;
    public static boolean tone = false;
    public static boolean candleLit = false;
    public static boolean openedChest = false;
    public static boolean door1Open = false;
    public static boolean door2Open = false;
    public static boolean door3Open = false;
    public static boolean bioWritten = false;
    public static boolean correctOrder = false;
    public static boolean time = false;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome adventurer, prepare yourself to escape, for you only have 30 turns to do so!");

        System.out.println("You find yourself in the Foyer, there is a bench, a chest, an unlit candle, and note. There is also a door to the north, but it is locked. What is your first action?");

        int turnCounter = 30;
        int turns = 0;

        while (room == 0) {
            if (turns == 30)
                System.out.println("You've failed");

            String choiceOne = scan.nextLine();
            if (choiceOne.equals("bench")) {
                System.out.println("There is nothing special about the bench");
            }
            if (choiceOne.equals("look chest")) {
                System.out.println("Just open it, stop wasting your time.");
            }
            if (choiceOne.equals("open chest")) {
                System.out.println("Inside the chest, you find a box of matches.");
                openedChest = true;
            }
            if (choiceOne.equals("get matches") && openedChest == true) {
                System.out.println("Probably useful.");
                hasMatch = true;
            }
            if (choiceOne.equals("get matches") && openedChest == false) {
                System.out.println("How do you know there's matches?");
            }
            if (choiceOne.equals("light candle") && hasMatch == false) {
                System.out.println("I don't think the candle appreciates you touching it that way.");
            }
            if (choiceOne.equals("look note")) {
                System.out.println("The note says, \"May my light show you the way.\"");
            }
            if (choiceOne.equals("light candle") && hasMatch == true) {
                System.out.println("You light the match, and then the candle. The door to the north is now unlocked!");
                candleLit = true;
            }
            if (choiceOne.equals("open door") && candleLit == true) {
                System.out.println("Good job... I guess.");
                door1Open = true;
            }
            if (choiceOne.equals("open door") && candleLit == false) {
                System.out.println("It's locked for a reason, can't you see the puzzle?");
            }
            if (choiceOne.equals("go north") && door1Open == false) {
                System.out.println("I think you need a lesson in doors. Try opening it first?");
            }
            if (choiceOne.equals("go north") && door1Open == true) {
                room = 1;
            }
            turns++;
            turnCounter = turnCounter - 1;
            System.out.println("You have " + turnCounter + " more turns.");
        }

        System.out.println("You walk into the Library. There is a shelf of books, a desk, a pen, a scroll, and another unlocked door to the north.");

        while (room == 1) {
            String choiceTwo = scan.nextLine();
            if (choiceTwo.equals("look shelf") || choiceTwo.equals("look shelves")) {
                System.out.println("There's some ordinary books on the shelf, completely overshadowed by one cool looking book.");
            }
            if (choiceTwo.equals("look book")) {
                System.out.println("There is an open book on the shelf titled \"The Autobiography of...\" with the rest of the title empty");
            }
            if (choiceTwo.equals("look scroll") || choiceTwo.equals("read scroll")) {
                System.out.println("The scroll says, \"Share your story\"");
            }
            if (choiceTwo.equals("look pen")) {
                System.out.println("I'm pretty sure it's just a normal pen.");
            }
            if (choiceTwo.equals("get pen")) {
                System.out.println("I didn't know you were THAT poor.");
                hasPen = true;
            }
            if (choiceTwo.equals("look desk")) {
                System.out.println("The desk has nothing special about it, other than that it has a pen and a scroll on top of it.");
            }
            if (choiceTwo.equals("write book") && hasPen == true) {
                System.out.println("You take the pen and complete \"The Autobiography of...\" book by writing your name in the blank space. The door to the north has unlocked!");
                bioWritten = true;
            }
            if (choiceTwo.equals("open door") && bioWritten == true) {
                System.out.println("I'm so proud of you.");
                door2Open = true;
            }
            if (choiceTwo.equals("open door") && bioWritten == false) {
                System.out.println("I think you did this wrong... can't say I'm surprised though.");
            }
            if (choiceTwo.equals("go north") && door2Open == true) {
                room = 2;
            }
            if (choiceTwo.equals("go north") && door2Open == false) {
                System.out.println("I don't know how many times I need to tell you, you need to turn the handle first.");
            }
            turns++;
            turnCounter = turnCounter - 1;
            System.out.println("You have " + turnCounter + " more turns.");
        }

        System.out.println("You walk into the Conservatory. There are three instruments, a trumpet, a piano, a drum, a piece of sheet music, and a door to the north.");

        while (room == 2) {
            String choiceThree = scan.nextLine();
            if (choiceThree.equals("read music")) {
                System.out.println("You look at the sheet of music. It is empty except for the words \"Timbre, Tone, and Time\".");
            }
            if (choiceThree.equals("play trumpet")) {
                System.out.println("You play the trumpet.");
                timbre = true;
            }
            if (choiceThree.equals("play piano") && timbre == true) {
                System.out.println("You play the piano.");
                tone = true;
            }
                else if (choiceThree.equals("play piano")){
                    System.out.println("You play the piano.");
                }
            if (choiceThree.equals("play drum")) {
                System.out.println("You play the drum.");
            }
            if (choiceThree.equals("play drum") && timbre == true && tone == true) {
                correctOrder = true;
                System.out.println("The door to the outside has opened!");
            }
            if (choiceThree.equals("open door") && correctOrder == true) {
                System.out.println("I've never seen that handle turned quite as good as you just did.");
                door3Open = true;
            }
            if (choiceThree.equals("open door") && correctOrder == false) {
                System.out.println("You're on thin ice buddy.");
            }
            if (choiceThree.equals("go north") && door3Open == true) {
                System.out.println("You've escaped! Finally...");
                break;
            }
            if (choiceThree.equals("go north") && door3Open == false) {
                System.out.println("Yikes.");
            }
            turns++;
            turnCounter = turnCounter - 1;
            System.out.println("You have " + turnCounter + " more turns.");
        }
    }
}

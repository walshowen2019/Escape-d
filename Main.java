import java.util.Scanner;

public class Main {
    public static int room = 0;
    public static boolean hasMatch = false;
    public static boolean hasPen = false;
    public static boolean timbre = false;
    public static boolean tone = false;
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

            String choiceOne = scan.next();
            if (choiceOne.equals("bench")) {
                System.out.println("There is nothing special about the bench");
            }
            if (choiceOne.equals("chest")) {
                System.out.println("Inside the chest, you find a box of matches.");
                hasMatch = true;
            }
            if (choiceOne.equals("candle") && hasMatch == false) {
                System.out.println("It is a regular unlit candle.");
            }
            if (choiceOne.equals("note")) {
                System.out.println("The note says, \"May my light show you the way.\"");
            }
            if (choiceOne.equals("candle") && hasMatch == true) {
                System.out.println("You light the match, and then the candle. The door to the north is now unlocked!");
                room = 1;
            }
            turns++;
            turnCounter = turnCounter - 1;
            System.out.println("You have " + turnCounter + " more turns.");
        }

        System.out.println("You walk into the Library. There is a stack of books, a desk, a pen, a scroll, and another unlocked door to the north.");

        while (room == 1) {
            String choiceTwo = scan.next();
            if (choiceTwo.equals("book") && hasPen == false) {
                System.out.println("There is an open book on the shelf titled \"The Autobiography of...\" with the rest of the title empty");
            }
            if (choiceTwo.equals("scroll")) {
                System.out.println("The scroll says, \"Share your story\"");
            }
            if (choiceTwo.equals("pen")) {
                System.out.println("You pick up the pen");
                hasPen = true;
            }
            if (choiceTwo.equals("desk")) {
                System.out.println("The desk has nothing special about it, other than that it has a pen and a scroll on top of it.");
            }
            if (choiceTwo.equals("book") && hasPen == true) {
                System.out.println("You take the pen and complete \"The Autobiography of...\" book by writing your name in the blank space. The door to the north has unlocked!");
                room = 2;
            }
            turns++;
            turnCounter = turnCounter - 1;
            System.out.println("You have " + turnCounter + " more turns.");
        }

        System.out.println("You walk into the Conservatory. There are three instruments, a trumpet, a piano, a drum, a piece of sheet music, and a door to the north.");

        while (room == 2) {
            String choiceThree = scan.next();
            if (choiceThree.equals("music")) {
                System.out.println("You look at the sheet of music. It is empty except for the words \"Timbre, Tone, and Time\".");
            }
            if (choiceThree.equals("trumpet")) {
                System.out.println("You play the trumpet.");
                timbre = true;
            }
            if (choiceThree.equals("piano") && timbre == true) {
                System.out.println("You play the piano.");
                tone = true;
            }
                else if (choiceThree.equals("piano")){
                    System.out.println("You play the piano.");
                }
            if (choiceThree.equals("drum")) {
                System.out.println("You play the drum.");
            }
            if (choiceThree.equals("drum") && timbre == true && tone == true) {
                System.out.println("The door to the outside has opened! You've escaped!");
                break;
            }
            turns++;
            turnCounter = turnCounter - 1;
            System.out.println("You have " + turnCounter + " more turns.");
        }
    }
}

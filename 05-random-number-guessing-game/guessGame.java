import java.util.*;
public class guessGame {
  public static void main(String[] args) {
    int placeHolder = 0;
    int lives = 1;
    int loop = 0;
    int loop2 = 0;
    int ranNum = 0;
    String difficulty = "";
    String difficulty2 = "";
    String grammar = "";
    String[] kws = {"easy", "Easy", "medium", "Medium", "hard", "Hard"};
    // String yesno = "";
    while(lives > 0) {
      //loops the game if the user wants to play again.
      if(loop == 0) {
        ranNum = (int)(Math.random()*20+1); //gets the random number
        Scanner ask = new Scanner(System.in);
        System.out.println("Choose your difficulty: type Easy, Medium, or Hard."); //chooses the mode, later on compared with .equals
        difficulty = ask.nextLine();

        //if the user types something other than the three difficulties, the user will be promt "not a difficulty, try again."
        for(int i = 0; i<kws.length; i++) {
          if(difficulty.contentEquals(kws[i])) {
            loop2 = 1;
          }
        }
      while(loop2 == 0) {
          System.out.println(difficulty + " is not a difficulty, try again");
          Scanner askAgain = new Scanner(System.in);
          difficulty2 = askAgain.nextLine();
          for(int i = 0; i<kws.length; i++) {
            if(difficulty2.contentEquals(kws[i])) {
              loop2 = 1;
              difficulty = difficulty2;
        }
      }
    }

        System.out.println("difficulty " + difficulty + " has been chosen.");
        loop = 1;
        // System.out.println(difficulty.contentEquals("easy"));
        // System.out.println(kws.length);
      }
      //compares the difficulty to the strings containing the difficulty, this will set the number of lives and print a different statement for each if statement
      if(difficulty.equals("Easy") || difficulty.equals("easy")) {
        if(placeHolder == 0) {
          lives = 8;
          System.out.println("Your goal is to guess a number between 1-20 with 8 lives. Hints will be given.");
          placeHolder = 1;
        }
      }
      if(difficulty.equals("Medium") || difficulty.equals("medium")) {
        if(placeHolder == 0) {
          lives = 5;
          System.out.println("Your goal is to guess a number between 1-20 with 5 lives. Hints will be given.");
          placeHolder = 1;
        }
      }
      if(difficulty.equals("Hard") || difficulty.equals("hard")) {
        if(placeHolder == 0) {
          lives = 2;
          System.out.println("Your goal is to guess a number between 1-20 with 2 lives. A hint will be given.");
          placeHolder = 1;
        }
      }
        System.out.println("You may guess a number now: ");
        Scanner number = new Scanner(System.in);
        int theirGuess = number.nextInt();
        //if the number of lives is 1, lives will become life
        if(theirGuess > ranNum) {
          lives -= 1;
          if(lives == 1) {
            grammar = "life";
          } else {
            grammar = "lives";
            }
          if(lives == 0) {
              System.out.println("You ran out of lives, the number was " + ranNum + "\n If you want to play again, type yes, otherwise no.");
            Scanner again = new Scanner(System.in);
            String yesno = again.nextLine();
            if((yesno.equals("yes"))) {
              lives = 1; //it is important to assign these variables to a certain integer so the program is able to run in a loop until the user stops it
              loop = 0;
              loop2 = 0;
              placeHolder = 0;
            }
          } else {
          System.out.println("You have " + lives + " " + grammar + " left, guess lower.");
          }
        }
          if(theirGuess < ranNum) {
            lives -= 1;
            if(lives == 1) {
              grammar = "life";
            } else {
              grammar = "lives";
              }
            if(lives == 0) {
              System.out.println("You ran out of lives, the number was " + ranNum + "\n If you want to play again, type yes, otherwise no.");
              Scanner again = new Scanner(System.in);
              String yesno = again.nextLine();
              if((yesno.equals("yes"))) {
                lives = 1;
                loop = 0;
                loop2 =0;
                placeHolder = 0;
              }
            } else {
            System.out.println("You have " + lives + " " + grammar + " left, guess higher.");
            }
          }
            if(theirGuess == ranNum) {
              if(lives == 1) {
                grammar = "life"; //gammar variable is set to life or lives depending on the number of lives, this is put into place for correct grammar notation
              } else {
                grammar = "lives";
                }
                System.out.println("Congratulations, you guessed the number with " + lives + " " + grammar + " remaining!");
                lives = 0;
                if (lives == 0) {
                System.out.println("If you want to play again, type yes, otherwise no.");
                Scanner again = new Scanner(System.in);
                String yesno = again.nextLine();
                if((yesno.equals("yes"))) {
                  lives = 1;
                  loop = 0;
                  loop2 = 0;
                  placeHolder = 0;
                }
              }
            }
      }
    }
  }

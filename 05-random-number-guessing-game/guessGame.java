import java.util.*;
public class guessGame {
  public static void main(String[] args) {
    int placeHolder = 0;
    int lives = 1;
    int loop = 0;
    int ranNum = 0;
    String difficulty = "";
    String grammer = "";
    // String yesno = "";
    while(lives > 0) {
      if(loop == 0) {
        ranNum = (int)(Math.random()*20+1);
        Scanner ask = new Scanner(System.in);
        System.out.println("Choose your difficulty (Easy, Medium, Hard)");
        difficulty = ask.nextLine();
        System.out.println("difficulty " + difficulty + " has been chosen.");
        loop = 1;
      }
      if(difficulty.equals("Easy") || difficulty.equals("easy")) {
        if(placeHolder == 0) {
          lives = 8;
          System.out.println("Your goal is to guess a number between 1-20 with 8 lives.");
          placeHolder = 1;
        }
      }
      if(difficulty.equals("Medium") || difficulty.equals("medium")) {
        if(placeHolder == 0) {
          lives = 5;
          System.out.println("Your goal is to guess a number between 1-20 with 5 lives.");
          placeHolder = 1;
        }
      }
      if(difficulty.equals("Hard") || difficulty.equals("hard")) {
        if(placeHolder == 0) {
          lives = 2;
          System.out.println("Your goal is to guess a number between 1-20 with 2 lives.");
          placeHolder = 1;
        }
      }
        System.out.println("You may guess a number now: ");
        Scanner number = new Scanner(System.in);
        int theirGuess = number.nextInt();
        if(theirGuess > ranNum) {
          lives -= 1;
          if(lives == 0) {
              System.out.println("You ran out of lives, the number was " + ranNum + "\n If you want to play again, type yes, otherwise no.");
            Scanner again = new Scanner(System.in);
            String yesno = again.nextLine();
            if((yesno.equals("yes"))) {
              lives = 1;
              loop = 0;
              placeHolder = 0;
            }
          } else {
          System.out.println("You have " + lives + " lives left, guess lower.");
          }
        }
          if(theirGuess < ranNum) {
            lives -= 1;
            if(lives == 0) {
              System.out.println("You ran out of lives, the number was " + ranNum + "\n If you want to play again, type yes, otherwise no.");
              Scanner again = new Scanner(System.in);
              String yesno = again.nextLine();
              if((yesno.equals("yes"))) {
                lives = 1;
                loop = 0;
                placeHolder = 0;
              }
            } else {
            System.out.println("You have " + lives + " lives left, guess higher.");
            }
          }
            if(theirGuess == ranNum) {
              if(lives == 1) {
                grammer = "life";
              } else {
                grammer = "lives";
                }
                System.out.println("Congratulations, you guessed the number with " + lives + " " + grammer + " remaining!");
                lives = 0;
                if (lives == 0) {
                System.out.println("If you want to play again, type yes, otherwise no.");
                Scanner again = new Scanner(System.in);
                String yesno = again.nextLine();
                if((yesno.equals("yes"))) {
                  lives = 1;
                  loop = 0;
                  placeHolder = 0;
                }
              }
            }
      }
    }
  }

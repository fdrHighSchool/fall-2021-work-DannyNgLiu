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

        System.out.println(ranNum);
        loop = 1;
      }
      if(difficulty.equals("Easy") || difficulty.equals("easy")) {
        if(placeHolder == 0) {
          lives = 8;
          System.out.println("Your goal is to guess a number between 1-20 with 8 lives.");
          placeHolder = 1;
        }
        System.out.println("You may guess a number now: ");
        Scanner number = new Scanner(System.in);
        int theirGuess = number.nextInt();
        if(theirGuess > ranNum) {
          lives -= 1;
          if(lives == 0) {
            System.out.println("You ran out of lives, if you want to play again, type yes, otherwise no.");
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
              System.out.println("You ran out of lives, if you want to play again, type yes, otherwise no.");
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
}





        // System.out.println("You may guess a number now.");
        // Scanner number = new Scanner(System.in);
        // int theirGuess = number.nextInt();
      //   if(theirGuess > ranNum) {
      //     System.out.println("Guess Lower");
      //     lives -= 1;
      //   }
      //   if(theirGuess < ranNum) {
      //     System.out.println("guess higher");
      //     lives -= 1;
      //   }
      //   if(theirGuess == ranNum) {
      //     System.out.println("Congratulations, you guessed the number!");
      //   }
      // }
    // if(difficulty == "Medium" || difficulty == "medium") {
    //   if(placeHolder == 0) {
    //   System.out.println("You get 5 lives");
    //   lives = 5;
    //   placeHolder = 1;
    //     }
    //   }
    // if(difficulty == "Hard" || difficulty == "Hard") {
    //   if(placeHolder == 0) {
    //   System.out.println("You get 2 lives");
    //   lives = 2;
    //   placeHolder = 1;
    //     }

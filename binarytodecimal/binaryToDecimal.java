import java.util.*;

public class binaryToDecimal {
  public static void main(String[] args) {

    //loops code
    int loop = 1;
    while(loop == 1) {
    //takes user input, specifically a binary number and assigns it into a varible
    Scanner s = new Scanner(System.in);
    System.out.println("What binary number do you want to convert into decimal?");
    String userInput = s.nextLine();

    //uses a for loop to compare numbers from the right to the left. If it is equal to 1, use the power rule
    //on 2 with index and add it into decimal
      int index = -1;
      int decimal = 0;
      for(int i = userInput.length(); i>=0; i--) {
        String value = userInput.substring(i-1,i);
        index += 1;
        if(value.equals("1")) {
          decimal += Math.pow(2, index);
        }
        if(index == userInput.length()-1) {
          break;
        }
      }
    System.out.println(decimal);
    Scanner iteration = new Scanner(System.in);
    System.out.println("continue? (yes or no)");
    String answer = iteration.nextLine();
    if(answer.toLowerCase().equals("no")) {
      loop = 0;
      }
    }
  }
}

//does the calculation but goes into a condition - if statement that tests if the number is 1.
//If the number is 1, append the calculation to a variable.
//ex. 101 string.length-1 2^i if string.length(index, index-1).equals("1") { int number += 2^i}

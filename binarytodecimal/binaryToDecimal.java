import java.util.*;

public class binaryToDecimal {
  public static void main(String[] args) {

    //user input
    Scanner s = new Scanner(System.in);
    System.out.println("What binary number do you want to convert into decimal?");
    String userInput = s.nextLine();
    System.out.println(userInput);

    // for(int i = 0; i<userInput.length();i++) {
      int index = 0;
      int decimal = 0;
      for(int i = userInput.length(); i>0; i--) {
        String value = userInput.substring(i-1,i);
        //System.out.println("power: " + Math.pow(value,2));
      //  System.out.println(userInput.substring(i-1,i));
        index += 1;
        if(value.equals("1")) {
          decimal += Math.pow(index, 2);
          System.out.println(decimal);
        }
        if(index == userInput.length()-1) {
          break;
        }
      }
      // System.out.println(Math.pow(Double.parseDouble(userInput),2));
    // }
  }
}

//does the calculation but goes into a condition - if statement that tests if the number is 1.
//If the number is 1, append the calculation to a variable.
//ex. 101 string.length-1 2^i if string.length(index, index-1).equals("1") { int number += 2^i}

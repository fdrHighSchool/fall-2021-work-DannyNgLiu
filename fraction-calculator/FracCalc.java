import java.util.*;
public class FracCalc {
    /**
     * Prompts user for input, passes that input to produceAnswer, then outputs the result.
     * @param args - unused
     */
    public static void main(String[] args){
        // TODO: Read the input from the user and call produceAnswer with an equation
        // Checkpoint 1: Create a Scanner, read one line of input, pass that input to produceAnswer, print the result.

        Scanner userInput = new Scanner(System.in);
        System.out.println("Type your mathematical equation: ");
        String mathE = userInput.nextLine();
        if(mathE.toLowerCase().equals("quit")) {
            System.exit(0);
        }
        produceAnswer(mathE);


        // Checkpoint 2: Accept user input multiple times.
    }//end main method

    /**
     * produceAnswer - This function takes a String 'input' and produces the result.
     * @param input - A fraction string that needs to be evaluated.  For your program, this will be the user input.
     *      Example: input ==> "1/2 + 3/4"
     * @return the result of the fraction after it has been calculated.
     *      Example: return ==> "1_1/4"
     */
    public static String produceAnswer(String input){
        // TODO: Implement this function to produce the solution to the input
        // Checkpoint 1: Return the second operand.  Example "4/5 * 1_2/4" returns "1_2/4".

            int i = input.indexOf(" ");
            String operandOne = input.substring(0, i);
            String mathSign = input.substring(i+1, i+2);
            String operandTwo = input.substring(i+3, input.length());
            System.out.println(wholeNumDen(operandOne, operandTwo));

        // Checkpoint 2: Return the second operand as a string representing each part.
        //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4".


        // Checkpoint 3: Evaluate the formula and return the result as a fraction.
        //               Example "4/5 * 1_2/4" returns "6/5".
        //               Note: Answer does not need to be reduced, but it must be correct.
        // Final project: All answers must be reduced.
        //               Example "4/5 * 1_2/4" returns "1_1/5".

        return operandTwo;
    }//end produceAnswer method

    // TODO: Fill in the space below with helper methods

    /**
     * greatestCommonDivisor - Find the largest integer that evenly divides two integers.
     *      Use this helper method in the Final Checkpoint to reduce fractions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The GCD.
     */
    public static int greatestCommonDivisor(int a, int b){
      return 0;
    }//end greatestCommonDivisor method

    /**
     * leastCommonMultiple - Find the smallest integer that can be evenly divided by two integers.
     *      Use this helper method in Checkpoint 3 to evaluate expressions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The LCM.
     */
    public static int leastCommonMultiple(int a, int b){
      return 0;
    }//end leastCommonMultiple

    public static String wholeNumDen(String operandOne, String operandTwo) {
      int underScoreOne = operandOne.indexOf("_");
      int wholeOne = 0;
      int numeratorOne = 0;
      int denominatorOne = 0;
      int fractionOne = 0;
      int unmixedOne = 0;
      if (operandOne.contains("/")) {
      if (underScoreOne != -1) {
        wholeOne = Integer.parseInt(operandOne.substring(0, underScoreOne));
        // System.out.println("this is the whole number: " + whole);
      } else {
        underScoreOne = -1;
      }
      fractionOne = operandOne.indexOf("/");
      numeratorOne = Integer.parseInt(operandOne.substring(underScoreOne + 1, fractionOne));
      denominatorOne = Integer.parseInt(operandOne.substring(fractionOne + 1, operandOne.length()));

    }
    //if there is a whole number
    else {
      wholeOne = Integer.parseInt(operandOne.substring(0, operandOne.length()));
      numeratorOne = 0;
      denominatorOne = 1;
    }

    int underScoreTwo = operandTwo.indexOf("_");
    int wholeTwo = 0;
    int numeratorTwo = 0;
    int denominatorTwo = 0;
    int fractionTwo = 0;
    int unmixedTwo = 0;
    if (operandTwo.contains("/")) {
    if (underScoreTwo != -1) {
      wholeTwo = Integer.parseInt(operandTwo.substring(0, underScoreTwo));
      // System.out.println("this is the whole number: " + whole);
    } else {
      underScoreTwo = -1;
    }
    fractionTwo = operandTwo.indexOf("/");
    numeratorTwo = Integer.parseInt(operandTwo.substring(underScoreTwo + 1, fractionTwo));
    denominatorTwo = Integer.parseInt(operandTwo.substring(fractionTwo + 1, operandTwo.length()));

  }
  //if there is a whole number
  else {
    wholeTwo = Integer.parseInt(operandTwo.substring(0, operandTwo.length()));
    numeratorTwo = 0;
    denominatorTwo = 1;
  }

    String fullWND = "w:" + wholeOne + " n:" + numeratorOne + " d:" + denominatorOne + "\nw:" + wholeTwo + " n:" + numeratorTwo + " d:" + denominatorTwo;
    return fullWND;

  }











//put this inside the operation() method
//   if(operand.contains("_")) {
//   numerator = (whole*denominator) + numerator;
//   whole = 0;
// }


}//end class

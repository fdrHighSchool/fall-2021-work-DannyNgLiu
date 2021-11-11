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
            System.out.println(wholeNumDen(operandOne));
            System.out.println(wholeNumDen(operandTwo));

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

    public static String wholeNumDen(String operand) {
      int underScore = operand.indexOf("_");
      int whole = 0;
      int numerator = 0;
      int denominator = 0;
      int fraction = 0;
      if (operand.contains("/")) {
      if (underScore != -1) {
        whole = Integer.parseInt(operand.substring(0, underScore));
        // System.out.println("this is the whole number: " + whole);
      } else {
        underScore = -1;
      }
      fraction = operand.indexOf("/");
      numerator = Integer.parseInt(operand.substring(underScore + 1, fraction));
      denominator = Integer.parseInt(operand.substring(fraction + 1, operand.length()));
      System.out.println("the new unmixed numerator is: " + unmixed(operand, whole, numerator, denominator));
    }
    else {
      whole = Integer.parseInt(operand.substring(0, operand.length()));
      numerator = 0;
      denominator = 1;
      System.out.println("this is the whole number: " + whole);
    }
    String fullWND = "whole:" + whole + " numerator:" + numerator + " denominator:" + denominator;
    return fullWND;
  }

  public static int unmixed(String operand, int who, int num, int den) {
    int newNum = 0;
    if(operand.contains("_")) {
    newNum = (den*who) + num;
    return newNum;
    }
    return num;
  }

  public static int operation(String infoOperandOne, String infoOPrandTwo) {
    
  }

}//end class

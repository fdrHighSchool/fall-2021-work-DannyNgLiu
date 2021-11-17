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

        int temp = 0;
        while(temp == 0) {
          System.out.println("Type your mathematical equation: ");
          String mathE = userInput.nextLine();
          if(mathE.toLowerCase().equals("quit")) {
            System.exit(0);
          } else {
          System.out.println(produceAnswer(mathE));
          }
        }
    }//end main method

    public static String produceAnswer(String input) {

      //splits the user's input into operandOne, operandTwo and mathSign.

            int i = input.indexOf(" ");
            String operandOne = input.substring(0, i);
            String mathSign = input.substring(i+1, i+2);
            String operandTwo = input.substring(i+3, input.length());

        return wholeNumDen(operandOne, operandTwo, mathSign);

    }//end produceAnswer method



    public static String wholeNumDen(String operandOne, String operandTwo, String mathSign) {
      int underScoreOne = operandOne.indexOf("_");
      int wholeOne = 0;
      int numeratorOne = 0;
      int denominatorOne = 0;
      int fractionOne = 0;
      int unmixedOne = 0;

      //first the condition that is ran is if operandOne contains "/", if this is false, it would just be a whole number

      //the second condition that is ran is if the index of the underscore is not equal to -1, if there is no underscore
      //
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
      numeratorOne = Integer.parseInt(operandOne.substring(0, operandOne.length()));
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
    numeratorTwo = Integer.parseInt(operandTwo.substring(0, operandTwo.length()));
    denominatorTwo = 1;
  }

  if(operandOne.contains("_")) {
    if(operandOne.substring(0,1).equals("-")) {
      numeratorOne = (denominatorOne*wholeOne) - numeratorOne;
    } else {
      numeratorOne = (denominatorOne*wholeOne) + numeratorOne;
    }
  wholeOne = 0;
  }

  if(operandTwo.contains("_")) {
    if(operandTwo.substring(0,1).equals("-")) {
      numeratorTwo = (denominatorTwo*wholeTwo) - numeratorTwo;
    } else {
      numeratorTwo = (denominatorTwo*wholeTwo) + numeratorTwo;
    }
  wholeTwo = 0;
  }

  if(denominatorOne == 0 || denominatorTwo == 0) {
    return "ERROR: Cannot divide by zero.";
  }
    //String fullWND = "w:" + wholeOne + " n:" + numeratorOne + " d:" + denominatorOne + "\nw:" + wholeTwo + " n:" + numeratorTwo + " d:" + denominatorTwo;

    return calculation(mathSign, wholeOne, numeratorOne, denominatorOne, wholeTwo, numeratorTwo, denominatorTwo, operandOne, operandTwo);

  }

  public static String calculation(String sign, int wholeOne, int numeratorOne, int denominatorOne, int wholeTwo, int numeratorTwo, int denominatorTwo, String operandOne, String operandTwo) {
    if(sign.equals("*")) {
      int finalNumerator = numeratorOne*numeratorTwo;
      int finalDenominator = denominatorOne*denominatorTwo;
      if(operandOne.equals("0") || operandTwo.equals("0")) {
        return "0";
      } else {
      return multiply(finalNumerator, finalDenominator);
      }
    } else if(sign.equals("+")) {
      int finalDenominator = denominatorOne*denominatorTwo;
      int finalNumerator = (numeratorOne*denominatorTwo) + (numeratorTwo*denominatorOne);
      return addition(finalNumerator, finalDenominator);
    } else if(sign.equals("-")) {
      int finalDenominator = denominatorOne*denominatorTwo;
      int finalNumerator = (numeratorOne*denominatorTwo) - (numeratorTwo*denominatorOne);
      return subtraction(finalNumerator, finalDenominator);
    } else if(sign.equals("/")) {
      int finalNumerator = numeratorOne*denominatorTwo;
      int finalDenominator = denominatorOne*numeratorTwo;
      return division(finalNumerator, finalDenominator);
    }
    return "0";
  }

  public static String multiply(int finalNumerator, int finalDenominator) {

    for(int i=finalDenominator; i>1; i--) {
      if(((finalNumerator % i) == 0) && ((finalDenominator % i) == 0)) {
        finalNumerator = finalNumerator / i;
        finalDenominator = finalDenominator / i;
        i = -1;
        }
      }

      int wholeNum = finalNumerator / finalDenominator;
      int mixedFrac = finalNumerator % finalDenominator;

      if (wholeNum != 0) {
        mixedFrac = Math.abs(mixedFrac);
      }

      if (wholeNum == 0) {
      return mixedFrac + "/" + finalDenominator;
    } else if (mixedFrac == 0) {
      return Integer.toString(wholeNum);
    } else {
    return wholeNum + "_" + mixedFrac + "/" + finalDenominator;
    }
  }

  public static String addition(int finalNumerator, int finalDenominator) {

    for(int i=finalDenominator; i>1; i--) {
      if(((finalNumerator % i) == 0) && ((finalDenominator % i) == 0)) {
        finalNumerator = finalNumerator / i;
        finalDenominator = finalDenominator / i;
        i = -1;
        }
      }

      int wholeNum = finalNumerator / finalDenominator;
      int mixedFrac = finalNumerator % finalDenominator;

      if (wholeNum == 0) {
      return mixedFrac + "/" + finalDenominator;
    } else if (mixedFrac == 0) {
      return Integer.toString(wholeNum);
    } else {
    return wholeNum + "_" + mixedFrac + "/" + finalDenominator;
    }
  }

  public static String subtraction(int finalNumerator, int finalDenominator) {

    for(int i=finalDenominator; i>1; i--) {
      if(((finalNumerator % i) == 0) && ((finalDenominator % i) == 0)) {
        finalNumerator = finalNumerator / i;
        finalDenominator = finalDenominator / i;
        i = -1;

        }
      }

      int wholeNum = finalNumerator / finalDenominator;
      int mixedFrac = finalNumerator % finalDenominator;

      if (wholeNum != 0) {
        mixedFrac = Math.abs(mixedFrac);
      }

      if (wholeNum == 0) {
      return mixedFrac + "/" + finalDenominator;
    } else if (mixedFrac == 0) {
      return Integer.toString(wholeNum);
    } else {
    return wholeNum + "_" + mixedFrac + "/" + finalDenominator;
    }
  }

  public static String division(int finalNumerator, int finalDenominator) {

    for(int i=finalDenominator; i>1; i--) {
      if(((finalNumerator % i) == 0) && ((finalDenominator % i) == 0)) {
        finalNumerator = finalNumerator / i;
        finalDenominator = finalDenominator / i;
        i = -1;
        }
      }

      int wholeNum = finalNumerator / finalDenominator;
      int mixedFrac = finalNumerator % finalDenominator;

      if (wholeNum != 0) {
        mixedFrac = Math.abs(mixedFrac);
      }

      if (wholeNum == 0) {
      return mixedFrac + "/" + finalDenominator;
    } else if (mixedFrac == 0) {
      return Integer.toString(wholeNum);
    } else {
    return wholeNum + "_" + mixedFrac + "/" + finalDenominator;
    }
  }

}//end class

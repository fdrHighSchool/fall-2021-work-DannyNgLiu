import java.util.*;
public class FracCalc {

    public static void main(String[] args){

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


      //first the condition that is ran is if operandOne contains "/", if this is false, it would just be a whole number

      //the second condition that is ran is if the index of the underScore is not equal to -1, there is a whole number
      //with a fraction. If underScore is equal to -1, it indicates that operand is just a fraction.
      //We would use the locations of the / and underScore to determine if there is a whole, numerator and a denominator.

      if (operandOne.contains("/")) {
      if (underScoreOne != -1) {
        wholeOne = Integer.parseInt(operandOne.substring(0, underScoreOne));
      } else {
        underScoreOne = -1;
      }
      fractionOne = operandOne.indexOf("/");
      numeratorOne = Integer.parseInt(operandOne.substring(underScoreOne + 1, fractionOne));
      denominatorOne = Integer.parseInt(operandOne.substring(fractionOne + 1, operandOne.length()));

    }

    //if there is a whole number, we would set the numerator to the whole number, denominator to one and whole
    //to zero so it is improper.

    else {
      numeratorOne = Integer.parseInt(operandOne.substring(0, operandOne.length()));
      denominatorOne = 1;
    }

    //just a repeat to get the whole, numerator and denominator for the second operand.

    int underScoreTwo = operandTwo.indexOf("_");
    int wholeTwo = 0;
    int numeratorTwo = 0;
    int denominatorTwo = 0;
    int fractionTwo = 0;

    if (operandTwo.contains("/")) {
    if (underScoreTwo != -1) {
      wholeTwo = Integer.parseInt(operandTwo.substring(0, underScoreTwo));
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

  //this tests if any of the operand is undefined by testing if the denominator of both are 0. This also
  // tests if the numerator is zero when the mathematical sign is division.

if((operandOne.contains("/") || operandTwo.contains("/"))) {
    if((denominatorOne == 0) || (denominatorTwo == 0)) {
      return "ERROR: Cannot divide by zero.";
    }
  }
if(mathSign.equals("/") && numeratorTwo == 0) {
      return "ERROR: Cannot divide by zero.";
    }

  //if there is a whole which a fraction, it will make it a improper fraction using the condition if(operand.contains("_"));

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


    //String fullWND = "w:" + wholeOne + " n:" + numeratorOne + " d:" + denominatorOne + "\nw:" + wholeTwo + " n:" + numeratorTwo + " d:" + denominatorTwo;

    return calculation(mathSign, wholeOne, numeratorOne, denominatorOne, wholeTwo, numeratorTwo, denominatorTwo, operandOne, operandTwo);

  }

  public static String calculation(String sign, int wholeOne, int numeratorOne, int denominatorOne, int wholeTwo, int numeratorTwo, int denominatorTwo, String operandOne, String operandTwo) {

    //These are the rules needed for each operator when adding, subtracting, multiplying and dividing.

    if(sign.equals("*")) {
      int finalNumerator = numeratorOne*numeratorTwo;
      int finalDenominator = denominatorOne*denominatorTwo;
      if(operandOne.equals("0") || operandTwo.equals("0")) {
        return "0";
      } else {
      return operation(finalNumerator, finalDenominator);
      }
    } else if(sign.equals("+")) {
      int finalDenominator = denominatorOne*denominatorTwo;
      int finalNumerator = (numeratorOne*denominatorTwo) + (numeratorTwo*denominatorOne);
      return operation(finalNumerator, finalDenominator);
    } else if(sign.equals("-")) {
      int finalDenominator = denominatorOne*denominatorTwo;
      int finalNumerator = (numeratorOne*denominatorTwo) - (numeratorTwo*denominatorOne);
      return operation(finalNumerator, finalDenominator);
    } else if(sign.equals("/")) {
      int finalNumerator = numeratorOne*denominatorTwo;
      int finalDenominator = denominatorOne*numeratorTwo;
      return operation(finalNumerator, finalDenominator);
    }
    return "0";
  }

  public static String operation(int finalNumerator, int finalDenominator) {

    //This part of the code is used to simplify the numerator and the denominator based on the denominator. The for loop
    //will start from the denominator and minus one every loop until it reaches 1. If the numerator and denominator mod i
    //equals zero, that is the gcf. It will then divide the numerator and denominator to get the simplifed version.

    for(int i=finalDenominator; i>1; i--) {
      if(((finalNumerator % i) == 0) && ((finalDenominator % i) == 0)) {
        finalNumerator = finalNumerator / i;
        finalDenominator = finalDenominator / i;
        i = -1;
        }
      }

      //this is to bring the improper fraction back into a mixed fraction if possible.

      int wholeNum = finalNumerator / finalDenominator;
      int mixedFrac = finalNumerator % finalDenominator;

      //This code is to convert the fraction to a positive fraction if there is a whole. I did this because if
      //ran into a problem when having a subtracting operator. ex. 1 - 2_1/2 The output I would get is -1_-1/2.

      if (wholeNum != 0) {
        mixedFrac = Math.abs(mixedFrac);
      }

      //if the numerator is 0, the answer would be 0.

      if (finalNumerator == 0) {
        return "0";
      }

      //This is just print statements depending if there is a whole number or not.

      if (wholeNum == 0) {
      return mixedFrac + "/" + finalDenominator;
    } else if (mixedFrac == 0) {
      return Integer.toString(wholeNum);
    } else {
    return wholeNum + "_" + mixedFrac + "/" + finalDenominator;
  }
  }

}//end class

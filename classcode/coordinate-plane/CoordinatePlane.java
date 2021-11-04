// imports
import java.util.*;

public class CoordinatePlane {
  public static void main(String[] args) {
    // instantiate a scanner object
    Scanner s = new Scanner(System.in);

    System.out.println("which of the following do you want?");
    System.out.println("1. Distance calculator \n2. Area calculator");

    int choice = s.nextInt();

    if (choice == 1) {
      distance();
    }
    else {
      area();
    }

  }// end main method

  /*
   * Name: getX
   * Purpose: extract the x-value from a point
              convert the String to an int
   * Input: String coordinate pair (input from main)
   * Return: the x-value (int)
  */
  public static int getX(String point) {
    int commaPos = point.indexOf(",");

    // get the String version of x
    String xVal = point.substring(1, commaPos);

    // convert that String to an int
    int x = Integer.parseInt(xVal);

    // send the info back to main
    return x;
  }

  public static int getY(String point) {
    int commaPos = point.indexOf(",");

    // get the String version of y
    String yVal = point.substring(commaPos + 2, point.length() - 1);

    // convert that String to an int
    int y = Integer.parseInt(yVal);

    // send the info back to main
    return y;
  }

  public static void crowsDistance(int x1, int y1, int x2, int y2) {
    // distance formula = sqrt[(y2 - y1)^2 + (x2 - x1)^2]
    int deltaX = x2 - x1;
    int deltaY = y2 - y1;

    // distance formula = sqrt[(deltaY)^2 + (deltaX)^2]
    int deltaXsquared = deltaX * deltaX;
    int deltaYsquared = deltaY * deltaY;

    // distance formula = sqrt[(deltaYsquared + deltaXsquared]
    int sum = deltaYsquared + deltaXsquared;

    // distance formula = sqrt[sum]
    double distance = Math.sqrt(sum);

    System.out.println("The crow's distance between the two points is: " + distance);
  }// end crowsDistance method

  public static void taxicabDistance(int x1, int y1, int x2, int y2) {
    // distance forumla = |y2 - y1| + |x2 - x1|
    int distance = Math.abs(y2 - y1) + Math.abs(x2 - x1);

    System.out.println("The taxicab distance between the two points is: " + distance);

  }// end taxicabDistance method



  public static void distance() {

    Scanner s = new Scanner(System.in);

    System.out.print("please input a coordinate: ");
    String point1 = s.nextLine();

    int x1 = getX(point1);
    int y1 = getY(point1);

    System.out.print("please input another coordinate: ");
    String point2 = s.nextLine();

    int x2 = getX(point2);
    int y2 = getY(point2);

    crowsDistance(x1, y1, x2, y2);
    taxicabDistance(x1, y1, x2, y2);
    System.out.println(slope(x1, y1, x2, y2));
  }

  public static void area() {
    Scanner s = new Scanner(System.in);

    System.out.println("What shape do you want to know area of?");
    System.out.println("1. Square\n2. ");

    int choice = s.nextInt();

    if (choice == 1) {
      square();
    }
  } //end of area method

  public static void square() {
    Scanner s = new Scanner(System.in);
    System.out.println("Type your points clockwise in order starting from the bottom left");

    System.out.println("Type first point in this format (x, y)");
    String firstPoint = s.nextLine();

    System.out.println("Type second point in this format (x, y)");
    String secondPoint = s.nextLine();


    int slopeFirstSecond = (getY(secondPoint) - getY(firstPoint))/(getX(secondPoint) - getX(firstPoint));
    System.out.println(slopeFirstSecond);
 }
    public static double slope(int x1, int x2, int y1, int y2) {

    if(x1 != x2) {
      double slope = (y2 - y1)/(x2 - x1);
      return slope;
      }
      return 0.0;
    }

}// end class

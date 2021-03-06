import java.util.*;
public class coordinateplane {
  public static void main(String[] args) {
  Scanner askpoint = new Scanner(System.in);

  //gets the user's points by asking them and using a scanner to store it.
  System.out.println("Type your first point in this format (x, y)");
  String point1 = askpoint.nextLine();
  System.out.println("Type your second point in this format (x, y)");
  String point2 = askpoint.nextLine();

  //calls the functions xVal and yVal to get the x and y values in both points.
  int x1 = xVal(point1);
  int x2 = xVal(point2);
  int y1 = yVal(point1);
  int y2 = yVal(point2);

  //calls the crowDis and taxiDis with arguments passed to calculate the crow and taxicab distance.
  double crowDis = crowDistance(x1, y1, x2, y2);
  System.out.println("The crow distance is: " + crowDis);
  int taxiDis = taxicabDistance(x1, y1, x2, y2);
  System.out.println("The taxicab distance is: " + taxiDis);
}

    //gets the x values from both points by passing in the point as arguments.
    public static int xVal(String xPoint) {
    int indexOfComma = xPoint.indexOf(",");
    int x = Integer.parseInt(xPoint.substring(1, indexOfComma));
    return x;
    }

    //gets the y values from both points by pasing in the points as arguments.
    public static int yVal(String yPoint) {
    int indexOfComma = yPoint.indexOf(",");
    int y = Integer.parseInt(yPoint.substring(indexOfComma+2, yPoint.length()-1));
    return y;
    }

    //passes in the x and y values to calculate the crow distance using math.pow and math.sqrt.
    public static double crowDistance(int x1, int y1, int x2, int y2) {
      double crow = Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2));
      return crow;
    }

    //passes in the x and y values to calculate the taxicab distance using math.abs.
    public static int taxicabDistance(int x1, int y1, int x2, int y2) {
      int taxicab = Math.abs(y2 - y1) + Math.abs(x2 - x1);
      return taxicab;
    }
  }

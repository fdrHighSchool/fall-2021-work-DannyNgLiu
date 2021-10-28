import java.util.*;
public class coordinateplane {
  public static void main(String[] args) {
  Scanner askpoint = new Scanner(System.in);
  System.out.println("Type your first point in this format (x, y)");
  String point1 = askpoint.nextLine();
  System.out.println("Type your second point in this format (x, y)");
  String point2 = askpoint.nextLine();
  int x1 = xVal(point1);
  int x2 = xVal(point2);
  int y1 = yVal(point1);
  int y2 = yVal(point2);
  System.out.println(x1);
}
    public static void xVal(String xPoint) {
    int indexOfComma = xPoint.indexOf(",");
    int x = Integer.parseInt(xPoint.substring(1, indexOfComma));
    return x;
    }
    public static void yVal(String yPoint) {
    int indexOfComma = yPoint.indexOf(",");
    int y = Integer.parseInt(yPoint.substring(indexOfComma+2, yPoint.length()-1));
    return y;
    }
  }

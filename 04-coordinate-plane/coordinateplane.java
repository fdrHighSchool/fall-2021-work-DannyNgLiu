import java.util.*;
public class coordinateplane {
  public static void main(String[] args) {
  Scanner askpoint = new Scanner(System.in);
  System.out.println("Type your first point in this format (x,y)");
  String point1 = askpoint.nextLine();
  System.out.println("Type your second point in this format (x,y)");
  String point2 = askpoint.nextLine();
  xy();
  }
  Scanner.close();
  public static void xy() {
    System.out.println(point1);
  }
}

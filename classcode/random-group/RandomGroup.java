import java.util.*;

public class RandomGroup {
    public static void main(String[] args) {
      // System.out.println((int)(Math.random()*6 + 1));

      // create an instance of the Scanner class
      Scanner s = new Scanner(System.in);

      // ask user how many groups
      System.out.println("How many groups?");
      int numGroups = s.nextInt();
      // System.out.println(numGroups);

      // determine random group number
      int randomChoice = (int)(Math.random()*numGroups + 1);

      // output choice
      System.out.println("Group number " + randomChoice + " has been chosen!");

      s.close();
    }// end main method
}// end class

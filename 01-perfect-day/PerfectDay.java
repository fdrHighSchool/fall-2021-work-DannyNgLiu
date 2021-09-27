// In the morning,
// I want to get 9 hours of sleep the day before
// Eat vietnamese noodles for breakfast
//

/*
In the afternoon,
I would be on my computer playing videogames
I would be eating junkfood like hotcheetos and doritos
I would go to the schoolyard to play some basketball
*/

/*
At night,
I would go out with my family to go eat at korean barbecue.
*/

public class PerfectDay {
  public static void main(String[] args) {
    System.out.println("Here's my perfect day!");
    morning();
    newline();
    afternoon();
    newline();
    night();
  } //end main method


  public static void morning() {
    System.out.print("In the morning, ");
    System.out.println("I want to get 9 hours of sleep the day before");
    System.out.println("Eat vietnamese noodles for breakfast");
    System.out.println("I would do a couple of push-ups");
 } //end morning method

 public static void afternoon() {
   System.out.print("In the afternoon, ");
   System.out.println("I would be on my computer playing videogames");
   System.out.println("I would be eating junkfood like hotcheetos and doritos");
   System.out.println("I would go to the schoolyard to play some basketball");
 } //end afternoon method

 public static void night() {
   System.out.print("At night, ");
   System.out.println("I would go out with my family to go eat at korean barbecue.");
   System.out.println("I would go to an amusement park with my family");
   System.out.println("I would go to the beach and build a sandcastle")
 } //end night method
 public static void newline() {
   System.out.println("");
 } //end newline method
} //end class

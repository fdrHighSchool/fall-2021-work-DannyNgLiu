public class Rocket {
  public static void main(String[] args) {
//prints the rocketship with the five mthods below
upsidedownv();
box();
text();
box();
upsidedownv();
} //ends main method
  public static void upsidedownv() {
    System.out.println( "   /\\ ");
    System.out.println( "  /  \\ ");
    System.out.println( " /    \\ ");
  } //ends upsidedownv method
  public static void box() {
    System.out.println("+------+");
    System.out.println("|      |");
    System.out.println("|      |");
    System.out.println("+------+");
  } //ends box method
  public static void text() {
    System.out.println("|United|");
    System.out.println("|States|");
  } //ends text method
} //ends Rocket class

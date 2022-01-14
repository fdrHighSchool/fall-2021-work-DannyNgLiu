import java.util.*;
public class eluer {
  public static void main(String[] args) {
    int a = 0;
    int b = 0;
    int c = 0;
    int m = 2;
    int n = 1;
    for(int i=0; i<50; i++) {
      a = (int)(Math.pow(m,2) - Math.pow(n,2));
      b = 2 * m * n;
      c = (int)(Math.pow(m,2) + Math.pow(n,2));
      System.out.println(a + " " + b + " " + c);
      System.out.println(i);
      if(a + b + c == 1000) {
        System.out.println(a + " " + b + " " + c);
      } else if(i == 49) {
        m = 3;
        n = 0;
        i = 0;
      } else {
        m++;
        n++;
      }
    }
  }
}

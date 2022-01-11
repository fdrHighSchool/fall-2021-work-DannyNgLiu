import java.util.*;

public class exams {
  public static void main(String[] args) {
    int[][] grades = new int[15][5];
    for(int i=0; i<15; i++) {
        for(int q=0; q<5; q++) {
          grades[i][q] = (int)(Math.random() * 100) + 1;
        }
    }
    System.out.println(Arrays.deepToString(grades));
  }
}

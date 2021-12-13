import java.util.*;
public class average {
  public static void main(String[] args) {
    int[] arr = new int[100];
    for(int i=0; i<100; i++) {
    arr[i] = (int)(Math.random()*100)+ 1;
    }
    double total = 0.0;
    for(int i=0; i<arr.length; i++) {
      total += arr[i];
    }
    double average = total / arr.length;
    System.out.println(Arrays.toString(arr));
    System.out.println(average);
  }
}
//to do mode, rearrange the list from least to greatest and then compare the numbers until they change.
//once the number changes, get the index previously and then the new index

//two for loops, one loop goes from 1-25 and the second loop compares the number to arr[i]

import java.util.*;
public class average {
  public static void main(String[] args) {

    //creates an array with 100 random numbers ranging from 1-100
    int[] arr = new int[100];
    for(int i=0; i<100; i++) {
    arr[i] = (int)(Math.random()*100)+ 1;
    }

  //calls the function
  System.out.println(avg(arr));
  System.out.println(mode(arr));
}

  //add all the numbers averages it out
  public static double avg(int[] arr) {
    double total = 0.0;
    for(int i=0; i<arr.length; i++) {
      total += arr[i];
      }
    double average = total / arr.length;
    System.out.println(Arrays.toString(arr));
    return average;
    }

    //finds the number that is most frequent in the array
    public static int mode(int[] arr) {
      int max = 0;
      int[] frequency = new int[100];
      for(int i = 0; i<100; i++) {
        frequency[i] = 0;
      }
      for(int i = 0; i<100; i++) {
        frequency[arr[i]-1] += 1;
      }
      max = frequency[0];
      for(int i = 0; i<99; i++) {
        if(max < frequency[i+1]) {
          max = frequency[i+1];
        }
      }

      int counter = 1;
      System.out.println(Arrays.toString(frequency));
      for(int i = 0; i<100; i++) {
        //System.out.print(frequency[i]);
        if(max == frequency[i]) {
          int[] duplicates = new int[counter];
          duplicates[counter-1] = i + 1;
          counter += 1;
          System.out.println("this is the mode number(s): " + Arrays.toString(duplicates));
          System.out.println(duplicates.length);
        }
      }

      // int counter = 100;
      // int[] duplicates = new int[counter];
      // for(int i = 100; i>0; i--) {
      //   if(max == frequency[i]) {
      //     counter = counter - i;
      //     duplicates[counter] = arr[i];
      //   }

      return 0;
    }
  }
//to do mode, rearrange the list from least to greatest and then compare the numbers until they change.
//once the number changes, get the index previously and then the new index

//two for loops, one loop goes from 1-25 and the second loop compares the number to arr[i]

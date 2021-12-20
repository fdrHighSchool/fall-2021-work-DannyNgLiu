import java.util.*;
public class average {
  public static void main(String[] args) {

    //creates an array with 100 random numbers ranging from 1-100
    int[] arr = new int[100];
    for(int i=0; i<100; i++) {
    arr[i] = (int)(Math.random()*100)+ 1;
    }

  //calls the function
  System.out.println("this is the average: " + avg(arr));
  System.out.println("this the mode: " + mode(arr));
  System.out.println("this is the range: " + range(arr));
  System.out.println("this is the median: " + median(arr));
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
    public static String mode(int[] arr) {
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
      //System.out.println("largest duplicate is: " + max);

      int counter = 1;

      //System.out.println(Arrays.toString(frequency));

      String modeList = "";
      for(int i = 0; i<100; i++) {
        //System.out.print(frequency[i]);
        if(max == frequency[i]) {
          int[] duplicates = new int[counter];
          duplicates[counter-1] = i + 1;
          counter += 1;
          modeList = modeList + (i+1) + " ";
          // System.out.println("this is the mode number(s): " + Arrays.toString(duplicates));
          // System.out.println(duplicates.length);
        }
      }

      // int counter = 100;
      // int[] duplicates = new int[counter];
      // for(int i = 100; i>0; i--) {
      //   if(max == frequency[i]) {
      //     counter = counter - i;
      //     duplicates[counter] = arr[i];
      //   }

      return modeList;
    }

    public static int range(int[] arr) {
      int max = arr[0];
      for(int i = 0; i<arr.length-1; i++) {
        if(max < arr[i+1]) {
          max = arr[i+1];
        }
      }
      int min = arr[0];
      for(int i = 0; i<arr.length-1; i++) {
        if(min > arr[i+1]) {
          min = arr[i+1];
        }
      }
      return max - min;
    }

    public static double median(int[] arr) {
      int min = 0;
      int minLoc = -1;
      int temp = 0;
      for(int j = 0; j<arr.length;j++) {
        min = arr[j];
        for(int i = 0; i<arr.length-1; i++) {
          if (min > arr[i+1]) {
            min = arr[i+1];
            minLoc = i+1;
            //System.out.println("this is the location of min: " + minLoc);
            temp = arr[j];
            //System.out.println("this is the temp: " + temp);
            arr[minLoc] = temp;
            arr[j] = min;
            //System.out.println("this is the minimum number: " + min + " j value: " + j);
            }
          }
        }
        int firstIndex = arr[0];
        for(int v = 0; v<arr.length-1; v++) {
          arr[v] = arr[v+1];
      }
      // System.out.println(arr[arr.length/2-1] + arr[arr.length/2]);
      // System.out.println(Arrays.toString(arr));
      return (arr[arr.length/2-1] + arr[arr.length/2])/2;
    }
  }


//to do mode, rearrange the list from least to greatest and then compare the numbers until they change.
//once the number changes, get the index previously and then the new index

//two for loops, one loop goes from 1-25 and the second loop compares the number to arr[i]

import java.util.*;

/*
Suppose a class was scheduled to have 5 exams
and the teacher was storing those exam grades
for each student in their own array.
Due to a test that many students did poorly on,
a 6th test has been introduced.
*/

public class arrayOfGrades {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // sample student with 5 slots for grades
    int[] sampleStudent = new int[5];

    // fill up the "gradebook"
    for(int i = 0; i < sampleStudent.length; i++) {
      sampleStudent[i] = (int)(Math.random() * 46) + 55;
    } // end for loop
    int sixthExam = (int)(Math.random() * 46) + 55;
    // display the first 5 grades
    System.out.println(Arrays.toString(sampleStudent));
    System.out.println(replacement(sampleStudent));
    System.out.println(sixthExam);
    System.out.println(sampleStudent[4]);
    if(sixthExam > sampleStudent[4]) {
      sampleStudent[4] = sixthExam;
    }
    System.out.println(Arrays.toString(sampleStudent));
  } // end main method

/*
A) Write a method that adds a 6th exam
to the sample student’s set of grades.
*/

/*
B) Write a method that takes the original set
of 5 grades and replaces the lowest grade if
the 6th grade is greater than it.
If it is not, then the original 5 grades remain.
*/
 public static String replacement(int [] arr) {
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
  int first = arr[0];
  for(int i = 0; i<arr.length-1; i++) {
    arr[i] = arr[i+1];
  }
  arr[4] = first;
     return Arrays.toString(arr);
   }
}

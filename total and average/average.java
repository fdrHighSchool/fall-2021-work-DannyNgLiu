public class average {
  public static void main(String[] args) {
    int[] arr = new int[100];
    for(int i=0; i<100; i++) {
    arr[i] = (int)(Math.random()*99)+ 1;
    }
    double total = 0;
    for(int i=0; i<arr.length; i++) {
      total += arr[i];
    }
    double average = total / arr.length;
    System.out.println(average);
  }
}

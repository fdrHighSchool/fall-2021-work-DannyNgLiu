public class average {
  public static void main(String[] args) {
    int[] arr = new int[]{10,15,12,12,5};
    for(int i=0; i<5; i++) {
    }
    double total = 0;
    for(int i=0; i<arr.length; i++) {
      total += arr[i];
    }
    double average = total / arr.length;
    System.out.println(average);
  }
}

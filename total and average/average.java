public class average() {
  public static void main(String[] args) {
    int[] arr = new int[5];
    for(int i=0; i<5; i++) {
      arr = arr.append(Math.random()*5 + 1);
    }
  }
  System.out.println(arr);
}

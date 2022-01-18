import java.util.*;

public class connectFour {
  public static void main(String[] args) {
    String[][] board = new String[6][7];

    int turn = 1;
    //System.out.println(Arrays.deepToString(board));
    fillBoard(board);
    displayBoard(board);
    while(1 == 1) {
    Scanner s = new Scanner(System.in);
    System.out.println("Whcih column would you like to place your piece?");
    int userColumn = s.nextInt();
    System.out.println("turn is " + turn);
   placePieces(userColumn, board, turn);
       System.out.println("this is turn " + turn);
   displayBoard(board);
       System.out.println("this is turn " + turn);
    }
  } // end main method

  public static void fillBoard(String[][] board) {
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        board[row][col] = "[ ]";
      } // end inner loop
    } // end outer loop
  } // end fillBoard method

  public static void displayBoard(String[][] board) {
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        System.out.print(board[row][col] + " ");
      } // end inner for loop
      System.out.println();
    } // end outer for loop
  } // end displayBoard method

  public static void placePieces(int userColumn, String[][] board, int turn) {
    int temp = 5;
    System.out.println("this is turn " + turn);
    if(turn == 1) {
      while(board[temp][userColumn-1] != "[ ]") {
        temp--;
      }
      board[temp][userColumn-1] = "[X]";
      turn = 2;
      System.out.println("turn equals " + turn);
      temp = 5;
      return;
    }
    if(turn == 2) {
      while(board[temp][userColumn-1] != "[ ]") {
        temp--;
      }
      board[temp][userColumn-1] = "[O]";
      turn = 1;
      temp = 5;
      return;
    }
  }
} // end class

import java.util.*;

public class connectFour {
  public static void main(String[] args) {
    String[][] board = new String[6][7];

    //System.out.println(Arrays.deepToString(board));
    fillBoard(board);
    displayBoard(board);
    // while(1 == 1) {
    Scanner s = new Scanner(System.in);
    System.out.println("Whcih column would you like to place your piece?");
    int userColumn = s.nextInt();

   placePieces(userColumn, board);
   displayBoard(board);
 // }
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

  public static void placePieces(int userColumn, String[][] board) {
    int turn = 1;
    int temp = 5;
    if(turn == 1) {
      while(board[temp][userColumn] != "[ ]") {
        temp--;
      }
      board[temp][userColumn] = "[X]";
      turn = 2;
      temp = 5;
    }
    if(turn == 2) {
      while(board[temp][userColumn] != "[ ]") {
        temp--;
      }
      board[temp][userColumn-1] = "[O]";
      turn = 1;
      temp = 5;
    }
  }
} // end class

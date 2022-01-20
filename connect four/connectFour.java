import java.util.*;

public class connectFour {
  public static void main(String[] args) {
    String[][] board = new String[6][7];

    int turn = 1;

    int round = 0;
    //System.out.println(Arrays.deepToString(board));
    fillBoard(board);
    displayBoard(board);
    while(1 == 1) {
    Scanner s = new Scanner(System.in);
    System.out.println("Which column would you like to place your piece?");
    int userColumn = s.nextInt();

    round++;
    turn = round%2;
   placePieces(userColumn, board, turn);
   displayBoard(board);
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

    if(turn == 1) {
      while(board[temp][userColumn-1] != "[ ]") {
        temp--;
      }
      board[temp][userColumn-1] = "[X]";
      temp = 5;
      return;
    }
    if(turn == 0) {
      while(board[temp][userColumn-1] != "[ ]") {
        temp--;
      }
      board[temp][userColumn-1] = "[O]";
      temp = 5;
      return;
    }
  }
} // end class


// it never alternates because you're returning on line 51
// you only call place pieces once
// oh nvm
// so i don't
// think the turn variable is updated
// when you pass it to a function
// try setting the turn variable after you call place pieces

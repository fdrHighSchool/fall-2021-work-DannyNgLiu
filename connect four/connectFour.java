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

  public static void horizontal(int userColumn, String[][] board, int turn) {
    int counter = 0;
    for(int i = 0; i<7; i++) {
      if(board[row][i].equals((board[row][i+1]))) {
        counter++;
        if(counter == 3) {
          System.out.println("win");
          break;
        } else {
          counter = 0;
        }
      }
    }
  }



} // end class

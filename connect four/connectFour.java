import java.util.*;

public class connectFour {
  public static void main(String[] args) {
    String[][] board = new String[6][7];

    int turn = 1;

    int row = 0;
    int round = 0;
    int loop = 1;
    //System.out.println(Arrays.deepToString(board));
    fillBoard(board);
    displayBoard(board);
    while(loop == 1) {
    Scanner s = new Scanner(System.in);
    System.out.println("Which column would you like to place your piece?");
    int userColumn = s.nextInt();

    round++;
    turn = round%2;

   row = placePieces(userColumn, board, turn);
   //winCondition(userColumn, row, board, turn);
   //loop = horizontal(userColumn, row, board, turn);
   if((0 == horizontal(userColumn, row, board, turn)) || 0 == (vertical(userColumn, row, board, turn)) || 0 == (negDiagonal(userColumn, row, board, turn)) || 0 == (posDiagonal(userColumn, row, board, turn))) {
     loop = 0;
   }
   System.out.println(row);
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

  public static int placePieces(int userColumn, String[][] board, int turn) {

    int row = 0;
    int temp = 5;

    if(turn == 1) {
      while(board[temp][userColumn-1] != "[ ]") {
        temp--;
      }
      row = temp;
      board[temp][userColumn-1] = "[X]";
      temp = 5;
      return row;
    }
    if(turn == 0) {
      while(board[temp][userColumn-1] != "[ ]") {
        temp--;
      }
      row = temp;
      board[temp][userColumn-1] = "[O]";
      temp = 5;
      return row;
    }
    return row;
  }

    public static int horizontal(int userColumn, int row, String[][] board, int turn) {
      int counter = 0;
      for(int i = 0; i<6; i++) {
        if(board[row][i].equals(board[row][i+1])) {
          counter++;
          if(counter == 3) {
            if(turn == 1) {
              System.out.println("Player 1 won");
            } else if(turn == 0) {
              System.out.println("Player 2 won");
            }
            return 0;
          }
        } else {
          counter = 0;
        }
      if((board[row][i].equals("[ ]")) && (board[row][i+1].equals("[ ]"))) {
        counter = 0;
        }
      }
      return 1;
    }

    public static int vertical(int userColumn, int row, String[][] board, int turn) {
      int counter = 0;
      for(int i = 0; i<5; i++) {
        if(board[i][userColumn-1].equals(board[i+1][userColumn-1])) {
          counter++;
          if(counter == 3) {
            if(turn == 1) {
              System.out.println("Player 1 won");
            } else if(turn == 0) {
              System.out.println("Player 2 won");
            }
            return 0;
          }
        } else {
          counter = 0;
        }
        if((board[i][userColumn-1].equals("[ ]")) && (board[i+1][userColumn-1].equals("[ ]"))) {
          counter = 0;
        }
      }
      return 1;
    }

  public static int negDiagonal(int userColumn, int row, String[][] board, int turn) {
    int counter = 0;
    int index = 0;
    while((userColumn+index-1<7) && (row+index<6)) {
      index++;
    }
    int negCol = userColumn+index-1;
    int negRow = row+index;
    int i = 0;
    int counter2 = 0;
    while((negCol-i>-1) && (negRow-i>-1)) {
      if(negRow-i-2<0 || negCol-i-2<0) {
        break;
      }
      if(board[negRow-i-1][negCol-i-1].equals(board[negRow-i-2][negCol-i-2])) {
        counter2++;
        if(counter2 == 3) {
          if(turn == 1) {
            System.out.println("Player 1 won");
          } else if(turn == 0) {
            System.out.println("Player 2 won");
          }
          return 0;
        }
      } else {
        counter2 = 0;
      }
      if((board[negRow-i-1][negCol-i-1].equals("[ ]")) && (board[negRow-i-2][negCol-i-2].equals("[ ]"))) {
        counter2 = 0;
      }
      i++;
    }
    return 1;
  }

  public static int posDiagonal(int userColumn, int row, String[][] board, int turn) {
    int counter = 0;
    int index = 0;
    while((userColumn-index-1>-1) && (row+index<6)) {
      index++;
    }
    int posCol = userColumn-index-1;
    int posRow = row+index;
    int i = 0;
    int counter2 = 0;
    while((posCol+i<7) && (posRow-i>-1)) {
      if((posRow-i-2<0) ||  (posCol+i+2)>6) {
        break;
      }
      if(board[posRow-i-1][posCol+i+1].equals(board[posRow-i-2][posCol+i+2])) {
        counter2++;
        if(counter2 == 3) {
          if(turn == 1) {
            System.out.println("player 1 won");
          } else if(turn == 0) {
            System.out.println("player 2 won");
          }
          return 0;
        }
      } else {
        counter2 = 0;
      }
      if((board[posRow-i-1][posCol+i+1].equals("[ ]")) && (board[posRow-i-2][posCol+i+2].equals("[ ]"))) {
        counter2 = 0;
      }
      i++;
    }
    return 1;
  }

} // end class

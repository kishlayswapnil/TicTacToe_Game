import java.util.Random;
import java.util.Scanner;

public class ticTacToe {

    public static void boardReset(char[][] game) {
        for(char[] row : game)
        {
            for(char column : row)
            {
                System.out.print(column);
            }
            System.out.println();
        }
    }
    public static void assignPlayer() {
        Random player=new Random();
        int playerCheck=player.nextInt(2);
        if(playerCheck==0)
        {
            System.out.println("Player1=X");
            System.out.println("Player2=O");
        }else
        {
            System.out.println("Player1=O");
            System.out.println("Player2=X");
        }
    }
    public static void tossCheck() {
        Random tossValue=new Random();
        int checkToss=tossValue.nextInt(2);
        if(checkToss==0)
        {
            System.out.print("Player1");
        }else
        {
            System.out.print("Player2");
        }
    }
    public static void displayBoard(char[][] board) {
        for(char[] row : board)
        {
            for(char column : row)
            {
                System.out.print(column);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To TicTacToe Game.");
        char[][] gameBoard={{' ','|',' ','|',' '},
                            {'=','=','=','=','='},
                            {' ','|',' ','|',' '},
                            {'=','=','=','=','='},
                            {' ','|',' ','|',' '}};
        displayBoard(gameBoard);
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a position from 1-9.");
        int position=scan.nextInt();
    }
}

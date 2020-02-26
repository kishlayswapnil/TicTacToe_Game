import java.util.Random;

public class ticTacToe {

    public static void boardReset(int[][] game) {
        int ROW=3;
        int COLUMN=3;
        for(int index1=0; index1<ROW; index1++)
        {
            for(int index2=0; index2<COLUMN; index2++)
            {
                game[index1][index2]=1;
                System.out.print(game[index1][index2]);
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
    public static void main(String[] args) {
        System.out.println("Welcome To TicTacToe Game.");
    }
}

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
    public static void main(String[] args) {
        System.out.println("Welcome To TicTacToe Game.");
    }
}

public class Main{
    public static void main(String args[]){

        Player player1 = new Player("Vineel", PieceType.WHITE);
        Player player2 = new Player("Rahul", PieceType.BLACK);

        ChessSystem chessSystem = new ChessSystem();
        chessSystem.initializeGame(player1, player2);
        chessSystem.startGame();
    }
}
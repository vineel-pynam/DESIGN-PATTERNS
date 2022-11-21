public class Main{
    public static void main(String args[]){
        TicTacToeGame game = new TicTacToeGame();
        String result = game.startGame();

        if( result.equals("tie") ){
            System.out.println(" Game Tied...! ");
        }else{
            System.out.println("Winner: " + result);
        }
    }
}
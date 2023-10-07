public class TechnicalRound extends Interview{
    private int score;
    public TechnicalRound(int score){
        this.score = score;
    }

    @Override
    public void verify(){
        if( score < 85 ){
            System.out.println("Failed in TechnicalRound!");
        }else{
            super._nextRound();
        }
    }
}
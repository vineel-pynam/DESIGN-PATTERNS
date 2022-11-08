public class LLDRound extends Interview{
    private int score;
    public LLDRound(int score){
        this.score = score;
    }

    @Override
    public void verify(){
        if( score < 80 ){
            System.out.println("Failed in LLD Round!");
        }else{
            super._nextRound();
        }
    }
}
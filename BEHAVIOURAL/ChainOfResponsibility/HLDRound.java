public class HLDRound extends Interview{
    private int score;
    public HLDRound(int score){
        this.score = score;
    }

    @Override
    public void verify(){
        if( score < 80 ){
            System.out.println("Failed in HLD Round!");
        }else{
            super._nextRound();
        }
    }
}
public class HRRound extends Interview{
    private int score;
    public HRRound(int score){
        this.score = score;
    }

    @Override
    public void verify(){
        if( score < 75 ){
            System.out.println("Failed in HR Round!");
        }else{
            super._nextRound();
        }
    }
}
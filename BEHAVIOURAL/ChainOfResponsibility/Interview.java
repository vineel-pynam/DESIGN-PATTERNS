public abstract class Interview{

    Interview interview;
    public void setNextRound(Interview interview){
        this.interview = interview;
    }

    public abstract void verify();

    public void _nextRound(){
        if( interview != null ){
            interview.verify();
        }else{
            System.out.println("Interview Passed!");
        }
    }
}
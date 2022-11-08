public class Candidate{

    Interview interview;
    public Candidate(int r1, int r2, int r3, int r4){
        TechnicalRound tcr = new TechnicalRound(r1);
        LLDRound lld = new LLDRound(r2);
        HLDRound hld = new HLDRound(r3);
        HRRound hr = new HRRound(r4);

        tcr.setNextRound(lld);
        lld.setNextRound(hld);
        hld.setNextRound(hr);
        hr.setNextRound(null);

        this.interview = tcr;
    }

    public void getInterviewResult(){
        interview.verify();
    }

}
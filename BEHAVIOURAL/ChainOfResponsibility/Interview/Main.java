class Main{
    public static void main(String args[]){
        System.out.println("CANDIDATE-1: ");
        Candidate cand1 = new Candidate(85, 80, 80, 90);
        cand1.getInterviewResult();

        System.out.println("CANDIDATE-2: ");
        Candidate cand2 = new Candidate(85, 82, 84, 70);
        cand2.getInterviewResult();

        System.out.println("CANDIDATE-3: ");
        Candidate cand3 = new Candidate(90, 88, 79, 80);
        cand3.getInterviewResult();
    }
}
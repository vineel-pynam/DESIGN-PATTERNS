package atm_state;

import atm.Atm;

public abstract class State{

    private String ERROR_MSG = "Oops Something Went Wrong...!";

    private void printErrorMessage(){
        System.out.println(ERROR_MSG);
    }

    public void insertCard(Integer atmCard){
        printErrorMessage();
    }

    public void enterPin(Integer atmPin){
        printErrorMessage();
    }

    public void selectOperation(Operation operation){
        printErrorMessage();
    }

    public void withdrawCash(Integer amount){
        printErrorMessage();
    }

    public void exitAtm(){
        System.out.println("Collect Your Card");
        System.out.println("Thanks for using our Bank");
    }

}
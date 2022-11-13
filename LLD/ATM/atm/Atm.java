package atm;

import bank.*;
import atm_state.*;
import java.util.*;
import java.time.*;

public class Atm{

    private Bank bank;
    private Account account;
    private NoCardInsertedState noCardInsertedState;
    private AtmPinEnterState atmPinEnterState;
    private SelectOperationState selectOperationState;
    private CashWithdrawalState cashWithdrawalState;
    private State state;

    private Integer twoThousandNotes;
    private Integer fiveHundredNotes;
    private Integer hundredNotes;
    private Integer atmBalance;

    public Atm(Bank bank, Integer twoThousandNotes, Integer fiveHundredNotes, Integer hundredNotes){
        this.bank = bank;
        this.noCardInsertedState = new NoCardInsertedState(this);
        this.atmPinEnterState = new AtmPinEnterState(this);
        this.selectOperationState = new SelectOperationState(this);
        this.cashWithdrawalState = new CashWithdrawalState(this);
        this.state = noCardInsertedState;
        this.twoThousandNotes = twoThousandNotes;
        this.hundredNotes = hundredNotes;
        this.fiveHundredNotes = fiveHundredNotes;
        this.atmBalance = calculateAtmBalance(twoThousandNotes, fiveHundredNotes, hundredNotes);
    };

    private Integer calculateAtmBalance(Integer twoThousandNotes, Integer fiveHundredNotes, Integer hundredNotes){
        return (2000 * twoThousandNotes) + (500 * fiveHundredNotes) + (100 * hundredNotes);
    }

    public void fetchAndSetAccount(Integer atmCard){
        Account account = bank.getAccount(atmCard);
        this.account = account;
    }

    public void setAtmState(State state){
        this.state = state;
    }

    public AtmPinEnterState getAtmPinEnterState(){
        return this.atmPinEnterState;
    }

    public NoCardInsertedState getNoCardInsertedState(){
        return this.noCardInsertedState;
    }

    public SelectOperationState getSelectOperationState(){
        return this.selectOperationState;
    }

    public CashWithdrawalState getCashWithdrawalState(){
        return this.cashWithdrawalState;
    }

    public boolean validatePin(Integer atmPin){
        return account.getCardPin() == atmPin;
    }

    public boolean hasSufficientAmount(Integer amount){
        if( account.getBalance() < amount ){
            System.out.println("Insufficient Balance In Your Bank Account...!");
            return false;
        }

        if( atmBalance < amount ){
            System.out.println("Insufficient Balance In Our ATM...!");
            return false;
        }

        return true;
    }

    public void reduceAmount(Integer amount){
        this.atmBalance = atmBalance - amount;
        account.setBalance(account.getBalance() - amount);
        bank.updateAccount(account);
    }

    public void generateSlip(Integer amount){
        System.out.println("--- Account Slip --- ");
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Withrawal Amount: " + amount);
        System.out.println("Time: " + LocalDateTime.now());
        System.out.println();
    }

    public void insertCard(Integer atmCard){
        this.state.insertCard(atmCard);
    }

    public void enterPin(Integer atmPin){
        this.state.enterPin(atmPin);
    }

    public void selectOperation(Operation operation){
        this.state.selectOperation(operation);
    }

    public void withdrawCash(Integer amount){
        this.state.withdrawCash(amount);
    }


}
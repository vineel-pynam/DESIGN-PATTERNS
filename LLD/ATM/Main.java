import bank.*;
import atm.*;
import atm_state.*;

public class Main{
    public static void main(String args[]){
        Bank bank = new Bank();
        bank.addAccount(new Account(1, 10000, 1, 1));
        bank.addAccount(new Account(2, 20000, 2, 2));
        bank.addAccount(new Account(3, 1000, 3, 3));
        bank.addAccount(new Account(4, 100000, 4, 4));

        Atm atm = new Atm(bank, 20, 30, 50);
        atm.insertCard(1);
        atm.enterPin(1);
        atm.selectOperation(Operation.CASH_WITHDRAWAL);
        atm.withdrawCash(1000);

        atm.insertCard(1);
        atm.enterPin(1);
        atm.selectOperation(Operation.CASH_WITHDRAWAL);
        atm.withdrawCash(1000);

        atm.insertCard(1);
        atm.enterPin(1);
        atm.selectOperation(Operation.CASH_WITHDRAWAL);
        atm.withdrawCash(1000);

    }
}
package bank;

import java.util.*;

public class Bank{

    private HashMap<Integer, Account> bankAccounts;
    private HashMap<Integer, Integer> atmCardToAccountNumberMap;

    public Bank(){
        this.bankAccounts = new HashMap<Integer, Account>();
        this.atmCardToAccountNumberMap = new HashMap<Integer, Integer>();
    }

    public void addAccount(Account account){
        bankAccounts.put(account.getAccountNumber(), account);
        atmCardToAccountNumberMap.put(account.getAtmCard(), account.getAccountNumber());
    }

    public Account getAccount(Integer atmCard){
        Integer accountNumber = atmCardToAccountNumberMap.get(atmCard);
        return bankAccounts.get(accountNumber);
    }

    public void updateAccount(Account account){
        bankAccounts.put(account.getAccountNumber(), account);
    }

}
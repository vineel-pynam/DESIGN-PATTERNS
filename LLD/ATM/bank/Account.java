package bank;

public class Account{
    private Integer accountNumber;
    private Integer balance;
    private Integer atmCard;
    private Integer cardPin;

    public Account( Integer accountNumber, Integer balance, Integer atmCard, Integer cardPin){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.atmCard = atmCard;
        this.cardPin = cardPin;
    }

    public Integer getAccountNumber(){
        return this.accountNumber;
    }

    public Integer getBalance(){
        return this.balance;
    }

    public Integer getAtmCard(){
        return this.atmCard;
    }

    public Integer getCardPin(){
        return this.cardPin;
    }

    public void setBalance(Integer balance){
        this.balance = balance;
    }

    public void setCardPin(Integer cardPin){
        this.cardPin = cardPin;
    }

}
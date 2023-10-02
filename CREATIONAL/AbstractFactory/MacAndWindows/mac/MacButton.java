package mac;

import interfaces.Button;

public class MacButton implements Button{
    @Override
    public void setButtonText(){
        System.out.println("It is a Mac Button");
    }
}
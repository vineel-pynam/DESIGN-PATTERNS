package win;

import interfaces.Button;

public class WinButton implements Button{
    @Override
    public void setButtonText(){
        System.out.println("It is a Windows Button");
    }
}
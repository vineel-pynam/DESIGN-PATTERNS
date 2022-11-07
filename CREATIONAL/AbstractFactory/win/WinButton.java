package win;

import interfaces.Button;

public class WinButton implements Button{
    @Override
    public void paint(){
        System.out.println("Windows Button");
    }
}
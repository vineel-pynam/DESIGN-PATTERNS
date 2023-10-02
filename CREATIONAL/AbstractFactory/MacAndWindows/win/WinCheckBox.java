package win;

import interfaces.Checkbox;

public class WinCheckBox implements Checkbox{
    @Override
    public void setCheckBoxText(){
        System.out.println("It is a Windows Checkbox");
    }
}
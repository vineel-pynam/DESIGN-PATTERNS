package win;

import interfaces.Checkbox;

public class WinCheckBox implements Checkbox{
    @Override
    public void paint(){
        System.out.println("Windows Checkbox");
    }
}
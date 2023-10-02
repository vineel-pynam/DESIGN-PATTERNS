package mac;

import interfaces.Checkbox;

public class MacCheckBox implements Checkbox{
    @Override
    public void setCheckBoxText(){
        System.out.println("It is a Mac Checkbox");
    }
}
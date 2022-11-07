package mac;

import interfaces.Checkbox;

public class MacCheckBox implements Checkbox{
    @Override
    public void paint(){
        System.out.println("Mac Checkbox");
    }
}
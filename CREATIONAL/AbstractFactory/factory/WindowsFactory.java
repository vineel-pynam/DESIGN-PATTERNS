package factory;

import interfaces.*;
import win.*;

public class WindowsFactory implements UIfactory{

    @Override
    public Button createButton(){
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new WinCheckBox();
    }
}
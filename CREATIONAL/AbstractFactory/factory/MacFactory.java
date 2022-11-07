package factory;

import interfaces.*;
import mac.*;

public class MacFactory implements UIfactory{
    @Override
    public Button createButton(){
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new MacCheckBox();
    }
}
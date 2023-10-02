package mac;

import interfaces.*;

public class MacUiFactory implements UiFactory{
    @Override
    public Button createButton(){
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new MacCheckBox();
    }
}
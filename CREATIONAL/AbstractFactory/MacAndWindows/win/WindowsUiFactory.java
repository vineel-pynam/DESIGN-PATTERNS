package win;

import interfaces.*;

public class WindowsUiFactory implements UiFactory{

    @Override
    public Button createButton(){
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new WinCheckBox();
    }
}
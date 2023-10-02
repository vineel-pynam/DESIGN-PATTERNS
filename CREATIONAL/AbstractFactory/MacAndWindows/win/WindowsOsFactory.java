package win;

import interfaces.*;

public class WindowsOsFactory implements OsFactory{
    public UiFactory createOperatingSystemUi(){
        return new WindowsUiFactory();
    }
}

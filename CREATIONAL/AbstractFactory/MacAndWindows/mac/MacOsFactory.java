package mac;

import interfaces.*;

public class MacOsFactory implements OsFactory{
    public UiFactory createOperatingSystemUi(){
        return new MacUiFactory();
    }
}

import interfaces.*;
import mac.MacOsFactory;
import win.WindowsOsFactory;

public class Main{
    public static void main(String args[]){
        OsFactory osFactory = new MacOsFactory();
        UiFactory uiFactory = osFactory.createOperatingSystemUi();
        Button button = uiFactory.createButton();
        Checkbox checkbox = uiFactory.createCheckbox();

        // PRINTING
        button.setButtonText();
        checkbox.setCheckBoxText();
    }
}
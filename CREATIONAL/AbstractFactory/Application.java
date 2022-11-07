
import interfaces.UIfactory;
import interfaces.Button;
import interfaces.Checkbox;

public class Application{
    private Button button;
    private Checkbox checkbox;

    public Application(UIfactory uiFactory){
        button = uiFactory.createButton();
        checkbox = uiFactory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
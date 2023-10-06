import java.util.*;

public class MenuOptions{
    private List<Command> commandList = new ArrayList<Command>();

    public void add(Command command){
        commandList.add(command);
    }

    public void execute(){
        for( Command command : commandList ){
            command.execute();
        }
    }

} 
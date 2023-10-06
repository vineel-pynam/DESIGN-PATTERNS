import java.util.*;
public class RideInvoker{

    List<Command> commandList = new ArrayList<>();

    public void add(Command command){
        commandList.add(command);
    }

    public void execute(){
        for( Command command : commandList){
            command.execute();
        }
    }
}
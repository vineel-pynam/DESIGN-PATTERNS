public class Main{
    public static void main(String args[]){
        Document document = new Document();
        Command commandOpen = new OpenCommand(document);
        Command commandSave = new SaveCommand(document);

        MenuOptions menuOptions = new MenuOptions();

        menuOptions.add(commandOpen);
        menuOptions.add(commandSave);

        menuOptions.execute();
    }
}
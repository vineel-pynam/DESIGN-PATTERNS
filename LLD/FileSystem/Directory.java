import java.util.*;

public class Directory implements FileSystem{

    private String directoryName;
    public List<FileSystem> fileSystems;

    public Directory(String name){
        this.directoryName = name;
        fileSystems = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        fileSystems.add(fileSystem);
    }

    public void getName(){
        System.out.println(directoryName);
    }

    @Override
    public void ls(){
        for( FileSystem obj : fileSystems ){
            if( obj instanceof Directory ){
                Directory dir = (Directory) obj;
                dir.getName();
            }
            obj.ls();
            System.out.println();
        }
    }
}
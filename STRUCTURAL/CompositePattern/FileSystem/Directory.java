import java.util.*;
class Directory implements FileSystem{
    private String name;
    private List<FileSystem> components;

    public Directory(String name){
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(FileSystem fileSystem){
        components.add(fileSystem);
    }

    @Override
    public void listContents(){
        System.out.println("Directory Name: " + this.name);
        for( FileSystem fileSystem : components){
            fileSystem.listContents();
        }
    }
    
    @Override
    public int getSize(){
        int totalSize = 0;
        for( FileSystem fileSystem : components){
            totalSize += fileSystem.getSize();
        }
        return totalSize;
    }
}
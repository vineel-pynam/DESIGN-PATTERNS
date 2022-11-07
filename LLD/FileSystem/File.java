public class File implements FileSystem{

    private String filename;

    public File(String name){
        this.filename = name;
    }

    @Override
    public void ls(){
        System.out.print(filename + " - ");
    }
}
class File implements FileSystem{
    private String name;
    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public void listContents(){
        System.out.println("File Name: " + this.name);
    }
    
    @Override
    public int getSize(){
        return size;
    }
}
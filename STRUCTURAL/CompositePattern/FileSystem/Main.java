class Main{
    public static void main(String args[]){
        Directory root = new Directory("Root");

        FileSystem file1 = new File("File1", 10);
        FileSystem file2 = new File("File2", 20);
        

        Directory subDir = new Directory("Sub Directory Of Root");
        FileSystem file3 = new File("File3", 30);

        subDir.addComponent(file3);
        root.addComponent(file1);
        root.addComponent(file2);
        root.addComponent(subDir);

        root.listContents();
        int totalSize = root.getSize();

        System.out.println("Total Size : " + totalSize);
    }
}
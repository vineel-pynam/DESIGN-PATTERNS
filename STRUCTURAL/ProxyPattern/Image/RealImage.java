class RealImage implements Image{
    private String filename;

    public RealImage(String filename){
        this.filename = filename;
        loadFromDisk();
    }

    @Override
    public void display(){
        System.out.println("Real Image File Name: " + filename);
    }

    public void loadFromDisk(){
        System.out.println("Loading image from disk....");
    }
}
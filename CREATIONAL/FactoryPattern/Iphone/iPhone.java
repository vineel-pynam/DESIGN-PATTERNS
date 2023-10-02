public class iPhone extends Phone{
    public iPhone(String os, String metal, String processor){
        super(os, metal, processor);
    }

    @Override
    public void design(){
        System.out.println("Design with 2 camera, 5.4inch screen");
    }

    @Override
    public void features(){
        System.out.println("No Sos feature and Crash Detection");
    }
}
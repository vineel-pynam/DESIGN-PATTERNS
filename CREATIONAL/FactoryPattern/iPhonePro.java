public class iPhonePro extends Phone{
    public iPhonePro(String os, String metal, String processor){
        super(os, metal, processor);
    }

    @Override
    public void design(){
        System.out.println("Design with 3 camera, 5.6inch screen");
    }

    @Override
    public void features(){
        System.out.println("Contains Sos feature and Crash Detection");
    }
}
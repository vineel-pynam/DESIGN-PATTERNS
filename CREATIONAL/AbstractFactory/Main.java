import factory.*;
class Main{
    public static void main(String args[]){
        Application ap = new Application(new MacFactory());
        ap.paint();
    }
}
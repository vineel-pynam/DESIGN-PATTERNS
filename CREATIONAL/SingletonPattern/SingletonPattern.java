
class SingletonPattern{
    private static volatile SingletonPattern sp = null;

    private SingletonPattern(){
        System.out.println("SingletonPattern is initiated...!");
    }

    public static SingletonPattern getConstructor(){
        if( sp == null ){
            synchronized(SingletonPattern.class){
                if( sp == null ){
                    sp = new SingletonPattern();
                }
            }
        }
        return sp;
    }
}
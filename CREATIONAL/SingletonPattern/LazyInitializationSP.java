public class LazyInitializationSP{
    private static LazyInitializationSP singletonInstance = null;
    private LazyInitializationSP(){}

    public static LazyInitializationSP getConstructor(){
        if( singletonInstance == null ){
            singletonInstance = new LazyInitializationSP();
        }
        return singletonInstance;
    }

}
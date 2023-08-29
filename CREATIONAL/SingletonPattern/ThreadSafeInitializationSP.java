public class ThreadSafeInitializationSP{
    private static ThreadSafeInitializationSP singletonInstance = null;
    private ThreadSafeInitializationSP(){}

    public static ThreadSafeInitializationSP getConstructor(){
        if( singletonInstance == null ){
            synchronized(ThreadSafeInitializationSP.class){
                singletonInstance = new ThreadSafeInitializationSP();
            }
        }
        return singletonInstance;
    }

}
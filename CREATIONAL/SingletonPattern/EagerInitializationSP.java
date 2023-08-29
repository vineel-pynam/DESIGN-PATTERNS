public class EagerInitializationSP{
    private static final EagerInitializationSP singletonInstance = new EagerInitializationSP();
    private EagerInitializationSP(){}

    public static EagerInitializationSP getConstructor(){
        return singletonInstance;
    }

}
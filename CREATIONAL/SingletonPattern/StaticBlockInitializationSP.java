public class StaticBlockInitializationSP{
    private static StaticBlockInitializationSP singletonInstance = null;
    static{
        try{
            singletonInstance = new StaticBlockInitializationSP();
        }catch(Exception e){
            System.out.println("Exception Occured While Creating Singleton Class");
        }
    }
    private StaticBlockInitializationSP(){}

    public static StaticBlockInitializationSP getConstructor(){
        return singletonInstance;
    }

}
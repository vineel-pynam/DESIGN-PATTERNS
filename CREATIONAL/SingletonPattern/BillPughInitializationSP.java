public class BillPughInitializationSP{
    private BillPughInitializationSP(){}

    private static class SingletonHelper{
        private static final BillPughInitializationSP INSTANCE = new BillPughInitializationSP();
    }

    public static BillPughInitializationSP getConstructor(){
        return SingletonHelper.INSTANCE;
    }

}
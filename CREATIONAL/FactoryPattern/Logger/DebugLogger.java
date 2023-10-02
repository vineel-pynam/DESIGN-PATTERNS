public class DebugLogger implements Logger {

    public DebugLogger() {
    }

    @Override
    public void log(){
        System.out.print("It is a Debug Logger");
    }
}

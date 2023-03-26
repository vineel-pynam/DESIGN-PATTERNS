public class Main{
    public static void main(String[] args){
        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        logger.log(Logger.INFO, "Info Logger ");
        logger.log(Logger.DEBUG, "Debug Logger ");
        logger.log(Logger.ERROR, "Error Logger ");
    }
}
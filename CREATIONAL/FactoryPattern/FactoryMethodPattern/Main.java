public class Main {
    public static void main(String args[]){
        LoggerFactory loggerFactory = new InfoLoggerFactory();
        Logger logger = loggerFactory.createLogger(LoggerType.DEBUG);
        logger.log();
    }
}

public class InfoLoggerFactory implements LoggerFactory{
    public Logger createLogger(LoggerType loggerType){
        return new InfoLogger();
    }
}

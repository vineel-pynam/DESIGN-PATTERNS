public class DebugLoggerFactory implements LoggerFactory {

    public Logger createLogger(LoggerType loggerType){
        return new DebugLogger();
    }
    
}

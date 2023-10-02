public class ErrorLoggerFactory implements LoggerFactory{

    public Logger createLogger(LoggerType loggerType){
        return new ErrorLogger();
    }
    
}

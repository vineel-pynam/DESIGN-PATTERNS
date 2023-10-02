public class LoggerFactory {
    public static Logger createLogger(LoggerType loggerType){
        if( loggerType == LoggerType.DEBUG ){
            return new DebugLogger();
        }else if( loggerType == LoggerType.ERROR ){
            return new ErrorLogger();
        }if( loggerType == LoggerType.INFO ){
            return new InfoLogger();
        }

        return new DebugLogger();
    }
}

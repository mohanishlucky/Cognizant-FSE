
public class Logger {

    // Single instance of Logger
    private static Logger instance;

    // Private constructor prevents object creation from outside
    private Logger() {
        System.out.println("Logger object created.");
    }

    public static Logger getInstance() {

        // Create object only once
        if (instance==null) {
            instance=new Logger();
        }

        return instance;
    }

    // Method to print log messages
    public void log(String message) {
        System.out.println("LOG:"+message);
    }
} 
package Singleton;
//You need to ensure that a logging utility class in your application has only one instance throughout the application lifecycle to ensure consistent logging.
// Singleton Class

public class SingletonTest {
    public static void main(String[] args) {

        // Get first Logger instance
        Logger logger1 = Logger.getInstance();

        // Use logger
        logger1.log("Application Started");

        // Get second Logger instance
        Logger logger2 = Logger.getInstance();

        // Use logger again
        logger2.log("User Logged In");

        // Print memory addresses (hash codes)
        System.out.println("Logger1 HashCode: " + logger1.hashCode());
        System.out.println("Logger2 HashCode: " + logger2.hashCode());

        // Verify both references point to same object
        if (logger1 == logger2) {
            System.out.println("Singleton Pattern Verified!");
            System.out.println("Both logger1 and logger2 refer to the same object.");
        } else {
            System.out.println("Singleton Pattern Failed!");
        }
    }
}
package FSE_WEEK1_DESIGN_PATTERNS.singleton;

// Logger.java (No need for separate file)
class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("Same instance? " + (logger1 == logger2)); // true
        logger1.log("This is a log message.");
    }
}


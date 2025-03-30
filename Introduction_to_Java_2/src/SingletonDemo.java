//Question5

class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger Initialized.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started.");

        Logger logger2 = Logger.getInstance();
        logger2.log("User logged in.");

        if (logger1 == logger2) {
            System.out.println("Both references point to the same Logger instance.");
        }
    }
}
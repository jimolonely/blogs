package jimo.chainofresponsibility;

public abstract class AbstractLogger {
    public static int CONSOLE = 1;
    public static int FILE = 2;
    public static int ERROR = 3;

    int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}

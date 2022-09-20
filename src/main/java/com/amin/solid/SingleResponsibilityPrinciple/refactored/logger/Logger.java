package com.amin.solid.SingleResponsibilityPrinciple.refactored.logger;

public class Logger {

    private static FileLogger fileLogger = new FileLogger();
    private static ConsoleLogger consoleLogger = new ConsoleLogger();

    public static void info(String message) {
        fileLogger.logInFile(message);
        consoleLogger.logInConsole(message);
    }
}

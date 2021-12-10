package com.hwk.singleton;

public class Logger {
    private static Logger instance;
    private Logger(){
    }
    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }

        return instance;
    }

    public String logError(String error) {
        return "Error registered: " + error;
    }
    public String logInfo(String info) {
        return "Info registered " + info;
    }
    public String logMessage(String message) {
        return "Debug message " + message;
    }

}

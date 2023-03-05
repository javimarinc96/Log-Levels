public class LogLevels {
    
    public static String message(String logLine) {
        String[] split = logLine.split(":");
        String res = split[1].trim();
        return res;
    }

    public static String logLevel(String logLine) {
        String[] split = logLine.split(":");
        String res = split[0].replace("[","").replace("]","").trim().toLowerCase();
        return res;
    }

    public static String reformat(String logLine) {
        String res = message(logLine) + " " + "(" + logLevel(logLine) + ")";
        return res;
    }
}

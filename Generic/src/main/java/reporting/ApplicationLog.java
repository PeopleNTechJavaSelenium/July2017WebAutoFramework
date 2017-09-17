package reporting;

public class ApplicationLog {
    public static void epicLogger(String epic){
        TestLogger.log(epic);
        TestLogger.log("launch local browser");
    }
}

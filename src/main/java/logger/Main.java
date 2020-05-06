package string_classes;

public class Main {
    public static void main(String[] args) {
        CrazyLogger crazyLogger = new CrazyLogger();

        crazyLogger.addLog("JOPA");
        crazyLogger.addLog("ASS");
        crazyLogger.addLog("Arsch");

        System.out.println(crazyLogger.getLog());

        System.out.println(crazyLogger.getLog("JOPA"));

    }
}

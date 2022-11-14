package ua.hillel.homework8;

public class MyLogger {

    public void InfoLog() {
        System.out.println(EnumColor.INFO);
        System.out.println("Info");
    }

    public void DebugLog() {
        System.out.println(EnumColor.DEBUG);
        System.out.println("Debug");
    }

    public void WarningLog() {
        System.out.println(EnumColor.WARN);
        System.out.println("Warning");
    }

    public void ErrorLog() {
        System.out.println(EnumColor.ERROR);
        System.out.println("Error");
    }

}

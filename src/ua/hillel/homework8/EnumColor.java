package ua.hillel.homework8;

public enum EnumColor {
    INFO("\033[0;34m"), //blue
    DEBUG("\033[0;32m"), //green
    WARN("\033[0;33m"), // yellow
    ERROR("\033[0;31m"); // red


    public String code;


    EnumColor(String code) {
        this.code = code;
    }

    @Override
    public java.lang.String toString() {
        return code;
    }
}

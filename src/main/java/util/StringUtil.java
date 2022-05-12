package util;

public class StringUtil {
    public static final String NEWLINE = System.getProperty("line.separator");
    public static final String WHITE_COLOR = "white";
    public static final String BLACK_COLOR = "black";

    public static String buffer = "";

    public static String appendNewLine(String newString){
        return newString + NEWLINE;

    }

    private StringUtil(){}
}

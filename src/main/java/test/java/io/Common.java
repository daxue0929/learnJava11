package test.java.io;

/**
 * @author daxue0929
 * @date 2021/9/20
 */

public class Common {

    public static String DEFAULT_FOLDER = "java/io/";

    public static String getDefaultLocation(String fileName) {
        return DEFAULT_FOLDER + fileName;
    }

    public static void printLine() {
        System.out.println("-----------------------分隔线-----------------------");
    }



}

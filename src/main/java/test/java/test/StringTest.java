package test.java.test;

/**
 * @author daxue0929
 * @date 2021/9/28
 */

public class StringTest {
    public static void main(String[] args) {
        String dn = "OU=珠江实业集团,DC=gzprg,DC=com";

        String substring = dn.substring(dn.indexOf(",") + 1);
        System.out.println(substring);
    }



}

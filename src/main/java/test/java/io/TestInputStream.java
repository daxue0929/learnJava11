package test.java.io;

import java.io.IOException;
import java.io.InputStream;

import static test.java.io.Common.getDefaultLocation;
import static test.java.io.Common.printLine;

/**
 * @author daxue0929
 * @date 2021/9/20
 */

public class TestInputStream {
    public static void main(String[] args) throws InterruptedException, IOException {
        InputStream resourceAsStream = TestInputStream.class.getClassLoader()
            .getResourceAsStream(getDefaultLocation("a.txt"));
        int available = resourceAsStream.available();

        byte[] b = new byte[available];
        resourceAsStream.read(b,0, b.length);
        String s = new String(b);
        System.out.printf(s);

        int a = resourceAsStream.available();
        System.out.println("读取之后的流:" + a);
        resourceAsStream.close();

        printLine();

        InputStream stream = TestInputStream.class.getClassLoader()
            .getResourceAsStream(getDefaultLocation("a.txt"));

        printLine();




    }


}

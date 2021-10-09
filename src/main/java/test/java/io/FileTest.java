package test.java.io;

import java.io.*;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static test.java.io.Common.getDefaultLocation;
import static test.java.io.Common.printLine;

/**
 * @author daxue0929
 * @date 2021/9/20
 */

public class FileTest {
    public static void main(String[] args) throws IOException {



        File file = new File("/Users/daxue0929/openSourceCodes/learnJava11/src/main/resources/java/io/a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        //FileChannel channel = fileInputStream.getChannel();
        fileInputStream.close();

        printLine();

        File folder = new File("/Users/daxue0929/openSourceCodes/learnJava11/src/main/resources/java/io");
        if (folder.isDirectory()) {
            FileFilter testFileFilter = new TestFileFilter();
            File[] files = folder.listFiles(testFileFilter);

            folder.listFiles(File::isFile);

            ArrayList<File> fileList = new ArrayList<>(Arrays.asList(files));
            System.out.println("file list size: " + fileList.size());
            fileList.stream().forEach( item -> System.out.println("file name: " + item.getName()));
        }

        printLine();





    }

}

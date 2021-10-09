package test.java.utils.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static test.java.io.Common.printLine;

/**
 * @author daxue0929
 * @date 2021/9/25
 */

public class ListTest {

    public static void main(String[] args) {
        String[] s = new String[]{"a","b","c","d","e","f"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s));
        String[] objects = list.stream().filter(item -> item == "a").toArray(String[]::new);
        List<String> strings = new ArrayList<>(Arrays.asList(objects));



        printLine();



    }

}

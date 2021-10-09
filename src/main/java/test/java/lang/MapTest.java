package test.java.lang;

import java.util.HashMap;
import java.util.Map;

/**
 * @author daxue0929
 * @date 2021/9/28
 */

public class MapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value-1");
        map.put("key2", "value-2");
        map.put("key3", "value-3");
        map.put("key4", "value-4");

        map.keySet();
        map.entrySet();
        map.values();


    }
}

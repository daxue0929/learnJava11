package com.daxue.testenum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author daxue0929
 * @date 2021/10/9
 */

public class MainTest {
    public static void main(String[] args) {
        String name = Type.RED.name();
        System.out.println(name);

        Type[] values = Type.values();

        Type red = Type.valueOf("RED"); // return "RED"

        Map<String, Object> oldMap = Map.of(
            "testKey", "value",
            "testKey1", "value1",
            "testKey2", "value2",
            "testKey3", "value3");

        Map<String, Object> newMap = new HashMap<>(oldMap);

        Map<String, Object> objectModel = Map.of(
            "testKey", "value-default",
            "testKey1", "value-1");

        // 测试一下putAll的功能:关于更新的时候，可以使用此种方式。
        newMap.putAll(objectModel);

        System.out.println(newMap);

    }
}

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
        Map<String, Object> oldMap = Map.of(
            "testKey", "value",
            "testKey1", "value1",
            "testKey2", "value2",
            "testKey3", "value3");

        Map<String, Object> newMap = new HashMap<>(oldMap);

        Map<String, Object> objectModel = Map.of(
            "testKey", "value-default",
            "testKey1", "value-1");

        newMap.putAll(objectModel);

        System.out.println(newMap.toString());

    }
}

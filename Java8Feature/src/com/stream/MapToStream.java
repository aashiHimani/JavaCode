package com.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapToStream {
    public static <K, V> Stream<Map.Entry<K, V> > convertMapToStream(Map<K, V> map) {
        //Converting complete Map<Key, Value> into Stream
        return map.entrySet().stream();
        //Converting only the Keyset of the Map<Key, Value> into Stream
        //return map.keySet().stream();
        //Converting only the Value of the Map<Key, Value> into Stream
        //return map.values().stream();
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "hi");
        map.put(2, "hello");
        map.put(3, "bye");
        System.out.println("Map: " + map);
        Stream<Map.Entry<Integer, String> > stream = convertMapToStream(map);
        System.out.println("Stream: " + Arrays.toString(stream.toArray()));
    }
}

package _3_arrays_collections.exercise9;

import java.util.HashMap;

public class Application {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    private static void printKeys(HashMap<String, String> hashmap) {

    }

    private static void printKeysWhere(HashMap<String, String> hashmap, String text) {

    }

    private static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {

    }
}

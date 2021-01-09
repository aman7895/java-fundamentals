package labs_examples.datastructures.hashmap.labs;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate you're mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */

import java.util.HashMap;

public class Test {

    HashMap<String, String> testHashMap;

    public Test() {
        testHashMap = new HashMap<>();
    }

    public void testHashMapFunctions() {
        // put
        testHashMap.put("x", "First entry");

        // get
        System.out.println(testHashMap.get("x"));

        HashMap<String, String> secondTestMap = new HashMap<>();
        secondTestMap.put("y", "First entry in second map");
        secondTestMap.put("z", "Second entry in second map");

        // putAll
        testHashMap.putAll(secondTestMap);

        // size
        System.out.println(testHashMap.size());

        // contains
        if (testHashMap.containsKey("x")) {
            System.out.println("x is in the map");
        }

        // entrySet
        System.out.println(testHashMap.entrySet().size());

        // keySet and forEach
        testHashMap.keySet().forEach(System.out::println);

        // putIfAbsent
        testHashMap.putIfAbsent("x", "This won't be inserted.");

        // remove
        testHashMap.remove("z");

        // replace
        testHashMap.replace("x", "updating this value");

        // clear
        testHashMap.clear();

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.testHashMapFunctions();
        
    }
}

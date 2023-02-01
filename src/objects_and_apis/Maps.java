package objects_and_apis;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

    public static void main(String[] args) {

        // unordered

        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95); // Key, Value
        fruitCalories.put("lemon", 20);
        fruitCalories.put("orange", 45);

        fruitCalories.put("lemon", 17); // an update, overrides

        fruitCalories.putIfAbsent("orange", 50); // if absent, insert

        System.out.println(fruitCalories);
        System.out.println("orange -> " + fruitCalories.get("orange"));

        Set mapEntries = fruitCalories.entrySet(); // set for map entries
        Set mapKeys = fruitCalories.keySet(); // set for keys
        Collection values = fruitCalories.values(); // set for all values

        System.out.println("map entries : "
                + mapEntries);
        System.out.println("map keys : "
                + mapKeys);

        System.out.println("values : "
                + values);

    }

}

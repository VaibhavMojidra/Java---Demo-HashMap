import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        // create a new HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        // add key-value pairs
        hm.put("Vaibhav", 25);
        hm.put("Emily", 30);
        hm.put("Mark", 20);
        hm.put("Sarah", 35);

        // retrieve a value
        System.out.println("Age of Vaibhav is " + hm.get("Vaibhav"));

        // check if a key exists
        System.out.println("Does Mark exist in the map? " + hm.containsKey("Mark"));

        // check if a value exists
        System.out.println("Does value 35 exist in the map? " + hm.containsValue(35));

        // remove a key-value pair
        hm.remove("Emily");
        System.out.println("After removing Emily, the size of the map is " + hm.size());

        // get a set of keys
        System.out.println("The keys in the map are " + hm.keySet());

        // get a collection of values
        System.out.println("The values in the map are " + hm.values());

        // check if the map is empty
        System.out.println("Is the map empty? " + hm.isEmpty());
    }
}

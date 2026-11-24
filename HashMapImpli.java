
import java .util.*;
class HashMapImpli{

    public static void main(String args[]){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"khushboo");
        map.put(102,"Aman");
        map.put(103,"Pratishtha");
        map.put(104,"Tanvi");
        map.put(105,"Rakshita");

        System.out.println("HashMap Elements: "+map);
        System.out.println("Contains key 106: "+map.containsKey(106));
        System.out.println("Contains value Aman: "+map.containsValue("Aman"));
        System.out.println("Size of HashMap: "+map.size());
        System.out.println("Is HashMap empty: "+map.isEmpty());
        System.out.println("Value for key 104: "+map.get(104));
        System.out.println("Default value for key 102: "+map.getOrDefault(102, null));
    }
}
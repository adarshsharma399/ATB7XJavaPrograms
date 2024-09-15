package ex_24082024;

import java.util.HashMap;
import java.util.Map;

public class Lab176 {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("id1",1);
        map.put("id2",5);
        map.put("id3",5);
        map.put(null,5); //null as key only allowed single time
        map.put("id4",null);
        map.put("id5",null); //value as null can be multiple times
        //map.put("phone","Pramod"); //type doesn't match

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(5));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id3"));

        System.out.println("______________________");

        //How to iterate over all the elements
        for(Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey()+ "->" + item.getValue());
        }

    }
}
//245
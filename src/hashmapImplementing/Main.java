//Implementing hashmap using arrays
package hashmapImplementing;
import java.util.*;

class MapUsingHash{
    private Entity[] entities;
    public MapUsingHash(){
        entities = new Entity[100];
    }
    public void put(String key, String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);
    }
    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }
    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }
    private class Entity{
        String key;
        String value;

        public Entity(String key, String value){
            this.key = key;
            this.value = value;
        }
    }
}



public class Main {
    public static void main(String[] args) {
//        MapUsingHash map = new MapUsingHash();
//        map.put("Dhinesh", "M");
//        map.put("Danush", "R");
//        map.put("Hari", "PT");
//        System.out.println(map.get("Hari"));

        //Map using linkedlist
        HashmapUsingLL<String, Integer> map1 = new HashmapUsingLL<>();
        map1.put("dhinu", 1);
        map1.put("danush", 2);
        map1.put("hari", 3);
        System.out.println(map1.get("hari"));
        System.out.println(map1.containsKey("dhinu"));
        System.out.println(map1);
    }
}

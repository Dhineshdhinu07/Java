package immutableClass;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1); set.add(2);
        ImmutableClass obj =  new ImmutableClass(0, "Dhinu",set);
        set.add(7);
        int id = obj.getId();
        String name = obj.getName();
        System.out.println("Id: " + id + ", Name: " + name);
        Set<Integer> objSet = obj.getSet();
//        System.out.println(objSet);
        System.out.println(obj.getSet());
    }
}

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetAndHashSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Dhinesh");
        names.add("Danush");
        names.add("Dhines");
        names.add("Dhinu");
//      names.clear();
//        System.out.println(names);
//        names.forEach(System.out::println);
        Iterator<String> nam = names.iterator();
        while(nam.hasNext()){
            System.out.println(nam.next());

        }
    }
}

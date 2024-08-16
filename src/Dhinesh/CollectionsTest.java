package Dhinesh;
import java.nio.charset.Charset;
import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
//        OurGenericList<Integer> list = new OurGenericList<>();
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        Integer[] arr = list1.toArray(new Integer[0]);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(list1);
//        for(int num:list1){
//            System.out.println(num);
//        }
//        list1.set(2,45);
//        List<Integer> list2 = new ArrayList<>(list1);
//        list2.add(8);
//        System.out.println(list2);
//        List<Integer> linkedList = new LinkedList<>();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        ListIterator<Integer> iterator = linkedList.listIterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.previous());
        // FIFO Queue
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(3);
//        q.offer(4);
//        q.offer(5);
//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q.peek());
//        System.out.println(q.isEmpty());
//
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        while(!stack.isEmpty()){
//            System.out.println(stack.peek());
//            stack.pop();
//        }
//        Deque<Integer> dq = new ArrayDeque<>();
//        dq.offerFirst(1);
//        dq.offerFirst(2);
//        dq.offerLast(3);
//        dq.offerLast(4);
//        System.out.println(dq);
//        System.out.println(dq.pollLast());
//        System.out.println(dq.peekLast());
//        PriorityQueue<Integer> pq = new PriorityQueue<>((a , b) -> b - a);
//        pq.offer(1);
//        pq.offer(2);
//        pq.offer(0);
//        pq.offer(100);
//        List<Integer> list = new ArrayList<>();
//        int index=0;
//        while(!pq.isEmpty()){
//            if (index == 2)
//                break;
//            list.add(pq.poll());
//            index++;
//        }
//        System.out.println(list);
//        System.out.println(pq);
//        List<Students> marksList = new ArrayList<>();
//        marksList.add(new Students(87,80));
//        marksList.add(new Students(57,60));
//        marksList.add(new Students(77,98));
//        marksList.add(new Students(97,78));
//        marksList.add(new Students(89,88));
//
//        PriorityQueue<Students> spq = new PriorityQueue<>((s1 , s2) ->
//        {
//            System.out.println("Comparator's compareTo() is called");
//            return s2.getPhysics() - s1.getMaths();
//        });
//        for(Students st : marksList){
//            spq.add(st);
//        }
//        List<Students> top3 = new ArrayList<>();
//        index=0;
//        while(!spq.isEmpty()){
//            if(index==3) break;
//            top3.add(spq.poll());
//            index++;
//        }
//        System.out.println(top3);
//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        Set<Integer> set2 = new HashSet<>();
//        set2.add(2);
//        set2.add(3);
//        set2.add(4);
//        System.out.println(set);
//        System.out.println(set2);
//        System.out.println("After intersection i.e retaining");
//        set.retainAll(set2);
//        System.out.println(set);
//        System.out.println(set2);
//        System.out.println(set);
//        System.out.println(set2);
//        System.out.println("After union i.e addingAll");
//        set.addAll(set2);
//        System.out.println(set);
//        System.out.println(set2);
//        System.out.println(set);
//        System.out.println(set2);
//        System.out.println("After difference i.e removingAll");
//        set.removeAll(set2);
//        System.out.println(set);
//        System.out.println(set2);
//        Set<Integer> set2 = new HashSet<>();
//        set2.add(2);
//        set2.add(3);
//        set2.add(4);
//        for( int x : set2){
//            System.out.println(x);
//        }
//        Set<Students> set3 = new HashSet<>(marksList);
//        System.out.println(set3.contains(new Students(57,60)));

//        Set<Students> treeSet = new TreeSet<>((s1 , s2) -> s2.getPhysics() - s1.getPhysics());
//        treeSet.add(new Students(87,80));
//        treeSet.add(new Students(57,60));
//        treeSet.add(new Students(77,98));
//        treeSet.add(new Students(97,78));
//        treeSet.add(new Students(89,88));
//
//        for(Students x : treeSet){
//            System.out.println(x + ",");
//        }

//        NavigableSet<Integer> set4 = new TreeSet<>();
//        set4.add(3);
//        set4.add(4);
//        set4.add(8);
//        set4.add(0);
//        System.out.println(set4);
//        System.out.println(set4.ceiling(5));

//        Map<String , Integer> map = new HashMap<>();
//        map.put("Dhinesh" , 45);
//        map.put("Dhinu" , 4);
//        map.put("Dhin" , 8);
////        System.out.println(map.get("Dhinesh"));
////        System.out.println(map.getOrDefault("Dhin" , 0));
//
//        for(Map.Entry<String , Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey() + "," + entry.getValue());
//        }
//        for(String key : map.keySet()){
//            System.out.println(key + " " + map.get(key));
//        }
        NavigableMap<Integer , String> tmap = new TreeMap<>();
        tmap.put(45,"Dhinesh");
        tmap.put(4,"Dhinu");
        tmap.put(8,"Dhin");
        System.out.println(tmap);
//        for(Map.Entry<Integer , String> entry : tmap.entrySet()){
//            System.out.println(entry.getKey() + ", " + entry.getValue());
//        }
//        for(Integer key : tmap.keySet()){
//            System.out.println(key + " " + tmap.get(key));
//        }
//        System.out.println(tmap.pollFirstEntry());
//        System.out.println(tmap.pollLastEntry());
//        System.out.println(tmap.floorEntry(8));
//        System.out.println();

        Integer arr[] =  {3,8,7,3,5,9,0,1};
        Arrays.sort(arr);
        List<Integer> list =Arrays.asList(arr);
        Collections.sort( list, Collections.reverseOrder());
        System.out.println(list);


    }
}

package Linkedlist;

public class MainLinkedList {
    public static void main(String[] args) {
//        CustomLinkedList list = new CustomLinkedList();
//        list.insertFirst(5);
//        list.insertFirst(4);
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(1);
//        list.insertLast(6);
//        list.insertLast(7);
//        list.insert(0,0);
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
//        System.out.println(list.delete(2));
//
//        list.display();
//        CustomDLL list = new CustomDLL();
//        list.insertFirst(6);
//        list.insertFirst(5);
//        list.insertFirst(4);
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(1);
//        list.insertLast(7);
//        list.insert(7, 8);
//        list.insert(3, 0);
//        list.display();
        CustomCLL list = new CustomCLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.delete(1);
        list.display();


    }
}
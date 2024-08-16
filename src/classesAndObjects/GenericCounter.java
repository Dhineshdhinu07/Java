package classesAndObjects;

public class GenericCounter <T extends String>{
    T t;
    GenericCounter(T t){
        this.t=t;
    }
    void print(){
        System.out.println(t);
    }

}

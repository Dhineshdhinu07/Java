package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTutorial {
    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("Marry", 6);
        Field[] catFields =myCat.getClass().getDeclaredFields();
        for(Field field : catFields){
            if(field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(myCat, "Tom");
            }
        }
        Method[] catMethods = myCat.getClass().getDeclaredMethods();
//        for (Method method : catMethods){
//            method.setAccessible(true);
//            if(method.getName().equals("heyThisIsPrivate")){
//                method.invoke(myCat);
//            }
//        }
        for(Method method : catMethods){
            if(method.getName().equals("thisIsAPrivateStaticMethod")){
                method.setAccessible(true);
                method.invoke(null);
            }

        }
    }
}

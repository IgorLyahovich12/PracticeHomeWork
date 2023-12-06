package hw19.Ex9;

//package edu.igor.hw19.Ex9;
//
//public class Singleton<T> {
//public static T instance(){
//    if(instance==null)
//        instance=new Singleton<T>();
//    return instance;
//}
//private static instance=null;
//}
// не буде скомпільований зі static
public class Singleton<T> {
    private  Singleton<T> instance;

    public  Singleton<T> getInstance() {
        if (instance == null) {
            instance = new Singleton<T>();
        }
        return instance;
    }
}

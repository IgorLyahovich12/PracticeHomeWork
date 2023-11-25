
//import java.util.List;
//public class print {
//   public static void print(List<? extends Number> list) {
//    for (Number n:list)
//        System.out.println(n+" ");
//    System.out.println();
//    }
//}
//взагалі скомпілюється ,але буде працювати не з усіма типами
package edu.igor.hw19.Ex7;

import java.util.List;

public class Print<T extends Number> {
    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.println(n + " ");
        System.out.println();
    }
}

package test;

import java.util.*;

/**
 * Created by User on 13.01.2017.
 */
public class Main_mas {
    public static void main(String[] args) {
//        ArrayList <Integer> ar = new ArrayList<>();
//        ar.add(1);
//        ar.add(2);
//        ar.add(3);
//        ar.add(4);
//        ar.add(5);
//        ar.add(6);
//
//        for (int v: )


//        List <Integer> list = new ArrayList<Integer>() ;
//        list.add(1);
//        list.add(10);
//        list.add(7);
//        list.add(27);
//        list.add(11);
//        list.add(15);
//        list.add(9);
//
//        System.out.println(list.toString());
//
//        for (Integer i: list) {
//            if (i == 11) {
//                boolean b=list.remove(Integer.valueOf(9));
//                System.out.println(b);
//                list.add(Integer.valueOf(6));
//            }
//        }
//
//        System.out.println(list.toString());


        List<String> ls = new LinkedList<>();
        ls.add("aa");
        ls.add("bb");
        ls.add("cc");
        ls.add("dd");
        ls.add("ee");
        ls.add("kk");
        ls.add("ll");
        ls.add("ss");
        System.out.println(ls.toString());

        for (String s: ls) {
            if (s.equals("kk")) {
                System.out.println(s);
                ls.remove(3);
                break;
            }
        }
        System.out.println(ls.toString());

        ls.remove("ss");
        System.out.println(ls.toString());




    }
}

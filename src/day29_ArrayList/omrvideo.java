package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class omrvideo {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        System.out.println(list1);
        list1.addAll(Arrays.asList(1,2,3,4,5,6));
        System.out.println(list1);
        list1.removeAll(Arrays.asList(1,2));
        System.out.println(list1);
        list1.retainAll(Arrays.asList(5,6));
        System.out.println(list1);
        list1.removeIf(each-> each>5);
        System.out.println(list1);
        list1.addAll(Arrays.asList(11,11,12,12,13,14,15));
        int a=Collections.frequency(list1,11);
        System.out.println(a);
        ArrayList<Integer> unique=new ArrayList<>();
        for (Integer each : list1) {
          int b=  Collections.frequency(list1,each);
          if(b==1){
              unique.add(each);
          }
        }
        System.out.println(unique);
        System.out.println("---------------------------------------------");
        list1.addAll(Arrays.asList(11,11,12,12,13,14,15,3));
        ArrayList<Integer>unuque2=new ArrayList<>(list1);
        unuque2.removeIf(p-> Collections.frequency(list1,p)>1);
        System.out.println(unuque2);


        System.out.println("---------------------------------------------");
        ArrayList<String>list2=new ArrayList<>();
        list2.add("bilge");
        System.out.println(list2);
        System.out.println("---------------------------------------------");
        ArrayList<Character>list3= new ArrayList<>();
        list3.addAll(Arrays.asList('a','b'));
        System.out.println(list3);
        list3.remove(0);

        System.out.println(list3);
        System.out.println("---------------------------------------------");




    }
}

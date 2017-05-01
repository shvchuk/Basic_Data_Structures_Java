package Arrays;

import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        List<String> list = new java.util.ArrayList<>();

        list.add("Adam");
        list.add("Joe");
        list.add("Kevin");

        //System.out.println(list.get(1));

        for(String s: list)
            System.out.println(s);

        System.out.println("---------");

        Object[] array = list.toArray();

        for(Object o: array)
            System.out.println(o);
    }
}

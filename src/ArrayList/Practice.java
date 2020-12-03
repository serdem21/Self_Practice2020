package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Practice {

    public static void main(String[] args) {

        int simple[] = new int[5];

        ArrayList<Integer> myList = new ArrayList<Integer>(5);
        myList.add(10);
        myList.add(30);
        myList.add(50);
        myList.add(40);
        myList.add(100);

        System.out.println(myList);

        System.out.print("size is: " + myList.size());
        System.out.println();

       myList.remove(0);
        for (Integer x : myList) {
            System.out.print(x + " ");

        }

        for (Integer x : myList)
            System.out.println(x + " ");
        System.out.println("size is:" + myList.size());
        myList.set(0, 300);

    }

}

package Exercise1;
import java.util.ArrayList;

public class MaxMinIntListTest {

    public static void main(String[] args) {
        MaxMinIntList list = new MaxMinIntList();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(3);
        list.add(15);
        System.out.println("Minimum element: " + list.min());   
        System.out.println("Maximum element: " + list.max());

    }
}
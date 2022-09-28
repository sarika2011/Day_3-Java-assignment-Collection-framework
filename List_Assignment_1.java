
/*1).Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.*/
package testExeercise;
import java.util.*;
import java.io.*;

public class List_Assignment_1 {
    public static void main(String[] args)
    {
        List<Float> list = new ArrayList<>();
        list.add(5.8f);
        list.add(6.9f);
        list.add(2.7f);
        list.add(4.10f);
        list.add(1.9f);
        float sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);
 
        System.out.println("sum-> " + sum);
    }
}

//out put-sum-> 21.4
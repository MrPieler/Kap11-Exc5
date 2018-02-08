package Exc5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exc5
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            list.add((int)(Math.random()*15)+1);
        }
        sortAndRemoveDuplicates(list);
        System.out.println(list);
    }

    private static void sortAndRemoveDuplicates (List<Integer> list)
    {
        Set<Integer> set = new TreeSet<>();
        for (Integer i:list)
        {
            set.add(i);
        }
        list.clear();
        list.addAll(set);
    }
}

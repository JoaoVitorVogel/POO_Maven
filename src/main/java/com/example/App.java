package com.example;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        //s1.add(7);

        System.out.println(s1);

        System.out.println(s1.contains(6));

        Set<Integer> empty = new HashSet<>();
        //empty.add(7);

        System.out.println(s1.containsAll(empty));
    }
}

package com.javatraining.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet();
        hs.add("Sandeep");
        hs.add("Mani");
        hs.add("phani");
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        hs.remove("phani");
        System.out.println("<---After remove------>");
        Iterator<String> it1 = hs.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

    }
}

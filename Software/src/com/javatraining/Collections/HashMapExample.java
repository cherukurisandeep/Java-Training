package com.javatraining.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String args[]){
        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        hm.put(1,"Sandeep");
        hm.put(2,"Mani");
        hm.put(3,"King");
        System.out.println("<---------Before remove------>");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" --> "+m.getValue());
        }
        System.out.println("<------After Remove----->");
        hm.remove(2);
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" --> "+m.getValue());
        }
    }
}

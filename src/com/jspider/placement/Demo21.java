package com.jspider.placement;

import java.util.*;

public class Demo21 {
    public static void main(String[] args) {
        String s = "java";
        Map<Character,String> map = new LinkedHashMap<>();
        for (int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if (!map.containsKey(c))
            {
                map.put(c,i+"");
            }
            else
            {
                String temp =(String)map.get(c);
                temp = temp+","+i;
                map.put(c,temp);
            }
        }
        Iterator<Character> i =  map.keySet().iterator();
      while (i.hasNext())
      {
          Character key = i.next();
          System.out.println(key+"="+map.get(key));
      }
    }
}

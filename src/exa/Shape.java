package exa;

import java.util.*;

public class Shape{
    public static void main(String[] args) {
      Map<Integer, String>map = new HashMap<>();
      map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

        for (Integer key : map){
            if (key%2==0){
                System.out.println(map.get(key));
            }

            }
        }
    }
}
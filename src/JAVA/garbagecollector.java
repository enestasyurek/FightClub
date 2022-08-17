package JAVA;

import java.util.SortedMap;

public class garbagecollector {

    public static void main(String[] args) {
        String str = "Java";
        str = null;
        System.out.println();
        System.out.println(str);


        System.out.println("-------");

        Fight fight1 = new Fight("Enes",22);
        Fight fight2 = new Fight("İsmail",42);

        fight1 = fight2;



        System.out.println(fight1);
        System.out.println(fight2);
    }



}

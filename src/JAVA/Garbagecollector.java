package JAVA;

public class Garbagecollector {

    public static void main(String[] args) {
        String str = "Java";
        str = null;
        System.out.println();
        System.out.println(str);


        System.out.println("-------");

        Fight fight1 = new Fight("Enes",22);
        Fight fight2 = new Fight("İsmail",42);
        //Garbagecollector
        fight1 = null;
        fight1 = fight2;



        System.out.println(fight1);
        System.out.println(fight2);
    }



}

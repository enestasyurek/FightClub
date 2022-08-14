package JAVA;

public class Ring {
    public static void main(String[] args) {
        Fight fight = new Fight();
        System.out.println(fight);

        Fight fight1 = new Fight();
        fight1.name = "Sefa";
        fight1.age = 20;
        System.out.println(fight1);
    }

    
}

class Fight {

    public String name = "Enes";
    public int age;

    @Override
    public String toString() {
        return "Fight{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
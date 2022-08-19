package JAVA;

public class Ring {
    public static void main(String[] args) {

    }
}

class Fight {

    public String name;
    public int age;

    public Fight(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Fight{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
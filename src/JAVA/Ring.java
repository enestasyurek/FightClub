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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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
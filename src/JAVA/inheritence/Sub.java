package JAVA.inheritence;

public class Sub extends Base{

    private int age;

    public Sub(String name, String surname, int ID, int birthYear) {
        super(name, surname, ID, birthYear);
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = 2022 - getBirthYear();
    }

    @Override
    public String toString() {
        return super.toString() + " " + age;
    }

}

class Test{
    public static void main(String[] args) {
        Sub q1 = new Sub("Enes","Taşyürek",1,2000);
        System.out.println(q1);
    }
}
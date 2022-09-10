package JAVA.inheritence.abstractionPractice;

public class subTest extends abstractionTest {
    @Override
    public void print() {
        System.out.println("as");
    }

    @Override
    public void print2() {
        System.out.println("as2");
    }

    public static void main(String[] args) {
        subTest subTest = new subTest();
        subTest.print();
        subTest.print2();
    }
}


package exa;

abstract class A{}
class B extends A{}
class C extends B{}
public class Test {
    public static void main(String[] args) {
        A obj = new B();
        A obj2 = new C();
        B obj3 = new C();
        C obj4 = new B();
    }
}
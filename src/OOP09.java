public class OOP09 {
    public static void main(String[] args) {
        new B().say();
    }
}

class A {
    public void print(int n) {
        System.out.println("print() is called");
    }
}

class B {
    public void say() {
        A a = new A();
        a.print(10);
        System.out.println("say() is called");
    }
}

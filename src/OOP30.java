public class OOP30 {
    public static void main(String[] args) {
        T5 t5 = new T5();
        t5.test();

        Person6 p2 = new Person6();
        t5.test2(p2);
    }
}

class Person6 {
    String name = "jason";
}

class T5 {
    public void test() {
        Person6 p = new Person6();
        System.out.println(p.name);
    }

    public void test2(Person6 p) {
        System.out.println(p.name);
    }
}
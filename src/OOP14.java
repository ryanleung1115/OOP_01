public class OOP14 {
    public static void main(String[] args) {
        Person4 p = new Person4();
        p.name = "jason";
        p.age = 10;

        EE ee = new EE();
        ee.test(p);

        System.out.println("main(),");
        System.out.println("p.age = " + p.age);
    }
}

class Person4 {
    String name;
    int age;
}

class EE {
    public void test(Person4 p) {
        p = new Person4();
        p.name = "mike";
        p.age = 30;
    }
}
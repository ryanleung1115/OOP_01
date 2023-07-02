public class OOP13 {
    public static void main(String[] args) {
        Person3 p = new Person3();
        p.name = "jason";
        p.age = 10;

        DD dd = new DD();
        dd.test(p);

        System.out.println("main(),");
        System.out.println("p.age = " + p.age);
    }
}

class Person3 {
    String name;
    int age;
}

class DD {
    public void test(Person3 p) {
        p.age = 30;

        System.out.println("after change,");
        System.out.println("p.age = " + p.age);
        System.out.println();
    }
}
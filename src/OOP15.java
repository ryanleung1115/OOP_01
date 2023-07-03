public class OOP15 {
    public static void main(String[] args) {
        Person5 p = new Person5();
        p.name = "jason";
        p.age = 10;

        MyTools myTools = new MyTools();
        Person5 p4 = myTools.copyPerson(p);
        System.out.println("p: age=" + p.age + ", name=" + p.name);
        System.out.println("p4: age=" + p4.age + ", name=" + p4.name);
        System.out.println("p's hashcode: " + p.hashCode());
        System.out.println("p4's hashcode: " + p4.hashCode());
        System.out.println(p == p4);
    }
}

class MyTools {
    public Person5 copyPerson(Person5 p2) {
        Person5 p3 = new Person5();
        p3.name = p2.name;
        p3.age = p2.age;
        return p3;
    }
}

class Person5 {
    String name;
    int age;
}
public class OOP03 {
    public static void main(String[] args) {
        Student p1 = new Student();
        p1.age = 10;
        p1.name = "jason";

        Student p2 = p1;
        System.out.println(p2.age);
    }
}

class Student {
    int age;
    String name;
}
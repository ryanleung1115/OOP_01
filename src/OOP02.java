public class OOP02 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("age: " + person.age);
        System.out.println("name: " + person.name);
        System.out.println("salary: " + person.salary);
        System.out.println("pass: " + person.isPass);
    }
}

class Person {
    int age;
    String name;
    double salary;
    boolean isPass;
}
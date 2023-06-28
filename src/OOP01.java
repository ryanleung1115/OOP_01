public class OOP01 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "jason";
        cat1.age = 3;
        cat1.color = "white";

        System.out.println(cat1.name);
        System.out.println(cat1.age);
        System.out.println(cat1.color);
    }
}

class Cat {
    String name;
    int age;
    String color;
}
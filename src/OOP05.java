public class OOP05 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.speak();
        p1.sum(1000);
        int result = p1.getSum(100, 10);
        System.out.println("a+b: "+result);
    }
}

class Person1 {
    String name;
    int age;

    public void speak() {
        System.out.println("hello");
    }

    public void sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.println("sum: " + result);
    }

    public int getSum(int a, int b) {
        return a + b;
    }
}
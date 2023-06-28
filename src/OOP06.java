public class OOP06 {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        int getResult = p1.getSum(10, 20);
        System.out.println("a+b: " + getResult);
    }
}

class Person2 {
    public int getSum(int a, int b) {
        int result = a + b;
        return result;
    }
}


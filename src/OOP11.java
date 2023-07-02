public class OOP11 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        BB bb = new BB();
        bb.swap(num1, num2);

        System.out.println();
        System.out.println("main(),");
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
    }
}

class BB {
    public void swap(int a, int b) {
        System.out.println("before swap,");
        System.out.println("a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("after swap,");
        System.out.println("a = " + a + ", b = " + b);
    }
}
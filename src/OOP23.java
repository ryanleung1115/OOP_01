public class OOP23 {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.m(10);
        methods.m(2, 3);
        methods.m("hello world");
    }
}

class Methods {
    public void m(int n) {
        int result = n * n;
        System.out.println("n * n = " + result);
    }

    public void m(int n1, int n2) {
        int result = n1 * n2;
        System.out.println("n1 * n2 = " + result);
    }

    public void m(String str) {
        System.out.println("string = " + str);
    }
}
public class OOP18 {
    public static void main(String[] args) {
        T3 t3 = new T3();
        int result = t3.fib(7);
        System.out.println(result);
    }
}

class T3 {
    public int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
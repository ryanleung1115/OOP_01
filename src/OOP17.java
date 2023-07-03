public class OOP17 {
    public static void main(String[] args) {
        T2 t2 = new T2();
        int result = t2.fact(3);
        System.out.println(result);
    }
}

class T2 {
    public int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
public class OOP08 {
    public static void main(String[] args) {
        sum(10, 1);
    }

    public static void sum(double a, double b) {
        System.out.println(a + b);
    }

    public void sum2(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return;
    }

    public int[] getSumDiff(int n1, int n2) {
        int[] result = new int[2];
        result[0] = n1 + n2;
        result[1] = n1 - n2;
        return result;
    }

    public double getDouble() {
        return 10;
    }
}

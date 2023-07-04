public class OOP22 {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        System.out.println(calculator.calc(1, 10));
        System.out.println(calculator.calc(1.0, 10));
        System.out.println(calculator.calc(1, 10.0));
        System.out.println(calculator.calc(1, 10, 1));
    }
}

class MyCalculator {
    public int calc(int n1, int n2) {
        return n1 + n2;
    }

    public double calc(int n1, double n2) {
        return n1 + n2;
    }

    public double calc(double n1, int n2) {
        return n1 + n2;
    }

    public int calc(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}
public class OOP24 {
    public static void main(String[] args) {
        Methods2 methods = new Methods2();
        System.out.println(methods.max(10, 20));
        System.out.println(methods.max(20.0, 10.0));
        System.out.println(methods.max(10.0, 30.0, 20.0));
    }
}

class Methods2 {
    public int max(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        }
        return n2;
    }

    public double max(double n1, double n2) {
        if (n1 > n2) {
            return n1;
        }
        return n2;
    }

    public double max(double n1, double n2, double n3) {
        double max1;

        if (n1 > n2) {
            max1 = n1;
        } else {
            max1 = n2;
        }

        if (max1 > n3) {
            return max1;
        } else {
            return n3;
        }
    }
}
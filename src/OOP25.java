public class OOP25 {
    public static void main(String[] args) {
        Methods3 methods = new Methods3();
        System.out.println(methods.max(10, 20));
        System.out.println(methods.max(20.0, 10.0));
        System.out.println(methods.max(10.0, 30.0, 20.0));
    }
}

class Methods3 {
    public int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2, double n3) {
        double max1 = n1 > n2 ? n1 : n2;
        return max1 > n3 ? max1 : n3;
    }
}
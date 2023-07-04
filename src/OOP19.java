public class OOP19 {
    public static void main(String[] args) {
        T4 t4 = new T4();
        int num = t4.getPeach(1);
        System.out.println("initial number: " + num);
    }
}

class T4 {
    public int getPeach(int day) {
        if (day == 10) {
            return 1;
        }
        return (getPeach(day + 1) + 1) * 2;
    }
}
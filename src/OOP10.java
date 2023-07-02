public class OOP10 {
    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println(aa.isOdd(11));

        aa.print(4, 4, '#');
    }
}

class AA {
    public boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public void print(int row, int col, char ch) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
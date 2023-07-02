import java.util.Arrays;

public class OOP12 {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3};

        CC cc = new CC();
        cc.test(numArr);

        System.out.println("main(),");
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + ", ");
        }
    }
}

class CC {
    public void test(int[] arr) {
        arr[0] = 200;

        System.out.println("after change,");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
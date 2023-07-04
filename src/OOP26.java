public class OOP26 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 10};

        CalcSum calcSum = new CalcSum();
        calcSum.sum("calc sum", arr);
    }
}

class CalcSum {
    public void sum(String str, int... nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }

        System.out.println("======= " + str + " =======");
        System.out.println("length of params = " + nums.length);
        System.out.println("sum = " + result);
    }
}
public class RunningNumberOdd {
    public static void main(String[] args) {
        int low = 1;
        int up = 1000;
        int sum = 0;
        int num = low;

        while (num <= up) {
            sum = sum + num;
            num = num + 2;
        }
        System.out.println(sum);
    }
}

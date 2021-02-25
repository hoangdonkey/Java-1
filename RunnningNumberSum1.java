public class RunnningNumberSum1 {
    public static void main(String[] args) {
        int low = 9;
        int up = 899;
        int sum = 0;

        int num = low;
        while (num <= up) {
            sum += num;
            ++num;
        }

        System.out.println("The sum from "+low+" to "+up+" is "+sum);
    }
}

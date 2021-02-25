public class ArithmeticTest {
    public static void main(String[] args) {
        int num1 = 98;
        int num2 = 5;
        int sum, diff, product,quotient,remainder;
        
        sum = num1 + num2;
        diff = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;
        remainder = num1 % num2;
        int a = 31*num1+17*num2;

        System.out.println("The sum, difference, product, quotient and remainder of "+num1+" and "+num2+" are "+sum+", "+diff+", "+product+", "+quotient+", "+remainder);
        System.out.println("31 * 98 + 17 * 5 = "+a);
    }
}

import java.util.Scanner;

public class RectangleComputation {
    public static void main(String[] args) {
        double len;
        double wid;


        Scanner rectancle = new Scanner(System.in);
        System.out.println("Enter length: ");
        len = rectancle.nextDouble();
        System.out.println("Enter width: ");
        wid = rectancle.nextDouble();

        double A = len*wid;
        double P = (len+wid)*2;

        System.out.printf("Area: ");
        System.out.println(A);
        System.out.println("Parameter: ");
        System.out.println(P);
    }
}

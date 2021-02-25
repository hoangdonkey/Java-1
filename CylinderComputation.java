import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        double r;
        double h;
        double pi = 3.14;

        Scanner cylinder = new Scanner(System.in);
        System.out.println("Enter radius: ");
        r = cylinder.nextDouble();
        System.out.println("Enter height: ");
        h = cylinder.nextDouble();

        double baseA = (r*r)*pi;
        double surfaceA = 2*pi*r*(r+h);
        double V = pi*r*r*h;

        System.out.println("Base area: ");
        System.out.println(baseA);
        System.out.println("Surface area: ");
        System.out.println(surfaceA);
        System.out.println("Volume: ");
        System.out.println(V);
    }
}

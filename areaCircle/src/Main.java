import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double sliceCircle,pi = 3.14,area;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter valid of r: ");
        r = input.nextInt();
        System.out.println("r = " + r );
        area = pi * (r*r);
        sliceCircle = (double) ((pi*(r*r)*pi ) / 360);
        System.out.println("Area of the circle : " + area);
        System.out.println(sliceCircle);
    }
}
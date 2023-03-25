import java.util.Scanner;

public class area_triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the height of triangle: ");
        float h = in.nextFloat();

        System.out.println("Enter the base of triangle: ");
        float b = in.nextFloat();

        System.out.println("Area of triangle is : " + (b*h)/2);
    }
}

import java.util.Scanner;

public class area_rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        float l = in.nextFloat();

        System.out.println("Enter the breadth of rectangel:  ");
        float b = in.nextFloat();

        System.out.println("Area = " + l*b);
    }
}

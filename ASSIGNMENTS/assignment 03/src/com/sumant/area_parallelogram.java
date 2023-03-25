import java.util.Scanner;

public class area_parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of Parallelogram:");
        float b = in.nextFloat();
        System.out.println("Enter the height of Parallelogram:");
        float h = in.nextFloat();

        System.out.println("Area of parallelogram is:" + h*b);
    }
}

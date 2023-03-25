import java.util.Scanner;

public class volume_prism_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the base of prism: ");
        float b = in.nextFloat();

        System.out.println("Enter the height of prism:  ");
        float h = in.nextFloat();

        System.out.println("Area = " + b*h);
    }
}

import java.util.Scanner;

public class csa_cylinder_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder: ");

        float r = in.nextFloat();
        System.out.println("Enter the height of cylinder: ");
        float h = in.nextFloat();

        System.out.println("CSA of cylinder is: " + (2*3.14*r*h) );
    }
}

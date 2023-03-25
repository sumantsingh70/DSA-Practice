import java.util.Scanner;

public class volume_sphere_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of sphere: ");
        float r = in.nextFloat();

        System.out.println("Area of sphere is :" + (4*3.14*r*r*r)/3);
    }
}

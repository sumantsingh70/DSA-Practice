import java.util.Scanner;

public class volume_cone_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of base of cone: ");
        float r = in.nextFloat();
        System.out.println("Enter height of cone: ");
        float h = in.nextFloat();

        System.out.println("Volume of cone: " + (3.14*r*r*h)/3);

    }
}

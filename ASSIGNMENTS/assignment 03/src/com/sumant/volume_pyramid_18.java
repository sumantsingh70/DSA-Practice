import java.util.Scanner;

public class volume_pyramid_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Base length of pyramid: ");
        float l = in.nextFloat();
        System.out.println("Enter the Base width of pyramid: ");
        float w = in.nextFloat();
        System.out.println("Enter the height of pyramid: ");
        float h = in.nextFloat();

        System.out.println("Volume of pyramid: " + (l*w*h)/3 );
    }
}

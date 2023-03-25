import java.util.Scanner;

public class perimetre_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        float r = in.nextFloat();
        System.out.println("perimetre of circle is :" + 2*3.14*r);
    }
}

import java.util.Scanner;

public class perimetre_rectangel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the  two adjacent sides of rectangle:");
        float a = in.nextFloat();
        float b = in.nextFloat();

        System.out.println("Perimetre of rectangle: " + 2*(a+b) );


    }
}

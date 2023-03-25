import java.util.Scanner;

public class perimetre_parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the  two adjacent sides of parallelogram:");
        float a = in.nextFloat();
        float b = in.nextFloat();

        System.out.println("Perimetre of parallelogram: " + 2*(a+b) );
    }
}

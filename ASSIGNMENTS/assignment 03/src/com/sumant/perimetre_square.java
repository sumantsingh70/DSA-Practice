import java.util.Scanner;

public class perimetre_square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the side of square:");
        float s = in.nextFloat();

        System.out.println("Perimetre of square is: " + 4*s);
    }
}

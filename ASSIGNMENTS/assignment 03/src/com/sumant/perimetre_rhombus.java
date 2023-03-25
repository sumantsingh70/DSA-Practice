import java.util.Scanner;

public class perimetre_rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the side of rhombus:");
        float s = in.nextFloat();

        System.out.println("Perimetre of rhombus is: " + 4*s);
    }
}

import java.util.Scanner;

public class TSA_cube_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the the value of side of cube: ");
        float s = in.nextFloat();

        System.out.println("TSA of cube is :" + 6*s*s);
    }
}

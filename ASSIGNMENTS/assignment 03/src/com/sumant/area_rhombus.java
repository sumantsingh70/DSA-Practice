import java.util.Scanner;

public class area_rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of diagonal : ");
        float d1 = in.nextFloat();
        float d2 = in.nextFloat();

        System.out.println("Area of rhombus is : " + (d1*d2)/2) ;
    }
}

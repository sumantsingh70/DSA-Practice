import java.util.Scanner;

public class circum_area6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        int r = in.nextInt();
        area(r);
        circumference(r);
    }

    private static void circumference(int r) {
        float a = (float)(2*3.14*r);
        System.out.println("Circumference of circle is :"+a);
    }

    private static void area(int r) {
        float a = (float) (3.14*r*r);
        System.out.println("Area of circle is :"+a);
    }



    }


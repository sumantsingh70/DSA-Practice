import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter second number: ");
        int b = in.nextInt();
        int c = suma(a,b);
        System.out.println("Sum is :"+c);
        System.out.println("Enter first number: ");
        int d = in.nextInt();
        System.out.println("Enter second number: ");
        int e = in.nextInt();
        int f = suma(d,e);
        System.out.println("Sum is :"+f);
    }

    public static int suma(int a, int b) {
        int z = a+b;


        return z;
    }
}

import java.util.Scanner;

public class product_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = prod(a,b);
        System.out.println(ans);
    }

    private static int prod(int a, int b) {
        int z = (a*b);
        return z;
    }
}

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age:");
        int n = in.nextInt();
        String first = eglible(n);
        System.out.println("Enter your age");
        int a = in.nextInt();
        String second = eglible(a);
        int b =in.nextInt();
        System.out.println("Enter your age:");
        String third = eglible(b);

    }

    private static String eglible(int n) {
        int m = n;
        if (m>=18){
            System.out.println("Yes you are eglible for voting");
        }
        else {
            System.out.println("No you are not eglible for voting");
        }

        return null;

    }
}

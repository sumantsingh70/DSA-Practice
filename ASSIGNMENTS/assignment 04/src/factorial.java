import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for factorial:");
        int n = in.nextInt();
        fact(n);
    }

    private static void fact(int n) {
        int m = n;
        int prod=1;
        for (int i =1;i<=m;i++){
            prod=prod*i;

        }
        System.out.println(prod);
    }
}


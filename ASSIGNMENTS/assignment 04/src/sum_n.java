import java.util.Scanner;

public class sum_n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        int sum = 0;
        suma(n);



    }

    private static void suma(int n) {
        int sum = 0;
        for (int i = 1;i<=n;i++)
        {
            sum=sum+i;


        }
        System.out.println("Sum of first n natural numbers is : " + sum);
    }
}

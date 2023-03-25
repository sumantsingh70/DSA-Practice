import java.util.Scanner;

public class prime_bw_two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers between whose prime numbers you want:");
        System.out.println("Enter first number:");
        int n1 = in.nextInt();
        System.out.println("Enter second number:");
        int n2 = in.nextInt();
        pro(n1,n2);
    }

    private static void pro(int n1, int n2) {
        for (int i = n1; i<=n2;i++){
            for (int j =0;j<=i/2;j++){
                if ((j%i)==0){
                    System.out.println(i);
                }
            }
        }
    }
}

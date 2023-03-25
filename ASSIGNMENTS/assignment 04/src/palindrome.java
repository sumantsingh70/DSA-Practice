import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check if number is palindrome or not:");
        int n = in.nextInt();
        checks(n);


    }

    private static void checks(int n) {
        int y = n;
        int x ;
        int temp=0;
        while(n>0){
            x=n%10;
            n=n/10;
            temp=temp*10+x;

        }
        if (temp==y){
            System.out.println("Number is palindrome.");
        }
        else {
            System.out.println("Number is not palindrome");
        }
    }
}

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        if (check(n)){
            System.out.println(n+" " + "is prime");
        }
        else {
            System.out.println("Not prime.");
        }

    }

    static boolean check(int n) {
        if (n==0 && n==1){
            return false;
        }
        for (int i =2 ; i<n/2;i++){
            if ((n%i)==0)
                return false;
        }
    return true;
    }


}

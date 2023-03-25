import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= in.nextInt();
        String eo = number(n);
        System.out.println(eo);



    }

    private static String number(int n) {
        if (n%2==0){
            return "Number is even.";

        }
        else {
            return "Number is odd.";
        }



    }
}

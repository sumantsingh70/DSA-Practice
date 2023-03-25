import java.util.Scanner;

public class smallestlargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = in.nextInt();
        System.out.println("Enter second number: ");
        int second = in.nextInt();
        System.out.println("Enter third number: ");
        int third = in.nextInt();

        int largest = largest(first,second,third);
        int smallest = smallest(first,second,third) ;
        System.out.println("largest of three numbers "+first +" " +second+" " +third+" is  " +largest);
        System.out.println("smallest of three numbers "+first +" " +second+" " +third+" is  " +smallest);

    }

    private static int smallest(int first, int second, int third) {
        int min = first;
        if (min>second){
            min=second;
        }
        if (min>third){
            min=third;
        }
        return min;
    }

    public static int largest(int first, int second, int third) {
        int max = first;
        if (second>max){
            max=second;
        }
        if (third>max){
            max=third;
        }
        return max;
    }
}

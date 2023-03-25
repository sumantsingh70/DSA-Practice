import java.util.Scanner;

public class pythagoran_triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array you want. :");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of arrays: ");
        for (int i =0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for (int i =0; i<n;i++){
            System.out.print(a[i]+" ");

        }


        if (triplet(a,n)==true){
            System.out.println(" "+"Yes,it is a pythagoran triplet.");
        }
        else {
            System.out.println("No");
        }

    }

    private static boolean triplet(int[] a, int n) {
        for (int i = 0;i<n;i++){
            for (int j =i+1;j<n;j++){
                for (int k = j+1;k<n;k++){
                    int x = a[i]*a[i] , y=a[j]*a[j], z =a[k]*a[k];
                    if (x==y+z || y==x+z || z ==x+y)
                        return true;
                }
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        pattern8(4);
    }
    static void pattern3(int n){
        for (int row =1;row<=n;row++){
            for (int col=n;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    static void pattern4(int n){
        for (int row=1;row<=n;row++){
            int count =1;
            for (int col=1;col<=row;col++){

                System.out.print(count+ " ");
                count++;
            }
            System.out.println("");
        }
    }
    static void pattern5(int n){
        for (int row=1; row<=2*n-1 ; row++){
            int count = row>n ? 2*n-row:row;
            for (int col=1;col<=count;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    static void pattern6(int n){
        for (int row=1; row<=2*n-1 ; row++) {
            int count = row > n ? 2 * n - row : row;
            int space= n-count;
            for (int s=0;s<space;s++){
                System.out.print(" ");
            }
            for (int col = 1; col <= count; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void pattern7(int n){
        for (int row=1;row<=n;row++){
            for (int space = 0; space< n - row; space++){
                System.out.print(" ");
            }
            for (int col=row;col>=1;col--){
                System.out.print(col);
            }
            for (int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println("");
        }
    }

    static void pattern8(int n){
        n=2*n;
        for (int row=0;row<=n;row++){
            for (int col=0;col<=n;col++){
                int atEveryIndex=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
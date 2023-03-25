public class patterns {
    public static void main(String[] args) {
        pattern1(5);

    }
    static void pattern1(int n){
        int count=0;
        for (int row=1;row<=n;row++){
            if (row%2==0){
                count=0;
            }
            else {
                count=1;
            }
            for (int col=1;col<=row;col++){
                System.out.print(count+" ");
                count=1-count;
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        
    }
}

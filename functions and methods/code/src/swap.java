public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);

        String name = "Sumant";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String naam) {
        naam = "Rahul";
    }

    static void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;
    }
}

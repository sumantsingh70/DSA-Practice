import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your marks out of 100:");
        int m = in.nextInt();
         grade(m);

    }

 private static void grade(int m) {


//        if (m>=91 && m<=100){
//            System.out.println("AA");
//        }
//        if (m>=81 && m<=90)
//            System.out.println("AB");
//        if (m>=71 && m<=80)
//            System.out.println("BB");
//        if (m>=61 && m<=70)
//            System.out.println("BC");
//        if (m>=51 && m<=60)
//            System.out.println("CD");
//        if (m>=41 && m<=50)
//            System.out.println("DD");
//        if (m<=90)
//            System.out.println("fail");


     
     switch((int) m/10){
         case 9 :
             System.out.println("AA");
             break;
         case 8:
             System.out.println("AB");
             break;
         case 7:
             System.out.println("BB");
             break;
         case 6:
             System.out.println("BC");
             break;
         case 5:
             System.out.println("CD");
             break;
         case 4:
             System.out.println("DD");
             break;
         default:
                 System.out.println("fail");
             break;

     }


    }
}

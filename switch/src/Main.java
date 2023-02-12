import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//        String fruit = in.next();

//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits. ");
//            case "Apple" -> System.out.println("A sweet red fruit. ");
//            case "Orange" -> System.out.println("Round Fruit");
//            case "Grapes" -> System.out.println("Small Fruit");
//            default -> System.out.println("please enter a valid fruit.");
//        }

        //break condition not required in switch enhanced.

        int day = in.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("invalid");
//                break;
//        }

//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
// both are same but enhanced one looks clean though


        //NESTED SWITCH

    }
}
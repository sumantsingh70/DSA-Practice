import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Sumant Singh");
            case 2 -> System.out.println("Rahul Singh");
            case 3 -> {
                System.out.println("Employee No.3");
                switch (department) {
                    case "IT " -> System.out.println("IT DEPARTMENT");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department Entered.");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}

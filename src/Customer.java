import java.util.Scanner;

public class Customer {
    private static String[] customers = new String[5];

    public static void inputCustomerData(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < customers.length; i++){
            String firstName, lastName;

            while (true) {
                System.out.print("Enter first name for customer " + (i + 1) + ": ");
                firstName = scanner.nextLine();
                firstName = firstName.trim();
                if (!firstName.isEmpty()) {
                    break;
                }
                System.out.println("First name cannot be empty. Please try again.");
            }


            while (true) {
                System.out.print("Enter last name for customer " + (i + 1) + ": ");
                lastName = scanner.nextLine();
                lastName = lastName.trim();
                if (!lastName.isEmpty()) {
                    break;
                }
                System.out.println("Last name cannot be empty. Please try again.");
            }

//            do {
//                System.out.print("Enter first name for customer " + (i + 1) + ": ");
//                firstName = scanner.nextLine();
//                firstName = firstName.trim();
//                if (firstName.isEmpty()) {
//                    System.out.println("First name cannot be empty. Please try again.");
//                }
//            } while (firstName.isEmpty());
//
//            do {
//                System.out.print("Enter last name for customer " + (i + 1) + ": ");
//                lastName = scanner.nextLine();
//                lastName = lastName.trim();
//                if (lastName.isEmpty()) {
//                    System.out.println("Last name cannot be empty. Please try again.");
//                }
//            } while (lastName.isEmpty());
            customers[i] = firstName + " " + lastName;
        }
    }

    public static void displayCustomerData(){
        System.out.println("\nCustomer List:");
        for (String customer : customers) {
            System.out.println(customer);
        }
    }
}
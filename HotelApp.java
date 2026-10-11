import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FrontDesk frontDesk = new FrontDesk();
        int choice = 0;

        System.out.println("=========================================");
        System.out.println("            Hotel Services               ");
        System.out.println("=========================================");

        while (choice != 4) {
            System.out.println("\nHow may we help you?");
            System.out.println("[1] Request Luggage Cart");
            System.out.println("[2] Request Room Cleaning");
            System.out.println("[3] Pick Up Vehicle (Valet)");
            System.out.println("[4] Exit");
            System.out.print("Enter your choice (1-4): ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.print("Enter number of carts needed: ");
                        if (scanner.hasNextInt()) {
                            int carts = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            frontDesk.requestCart(carts);
                        } else {
                            System.out.println("Invalid input. Please enter a valid number.");
                            scanner.next();
                        }
                        break;

                    case 2:
                        System.out.print("Enter room number to clean: ");
                        if (scanner.hasNextInt()) {
                            int room = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            frontDesk.cleanRoom(room);
                        } else {
                            System.out.println("Invalid input. Please enter a valid room number.");
                            scanner.next();
                        }
                        break;

                    case 3:
                        System.out.print("Enter vehicle plate number: ");
                        String plate = scanner.nextLine();
                        frontDesk.pickUpVehicle(plate);
                        break;

                    case 4:
                        System.out.println("Thank you for using the Hotel Management App. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please select between 1 and 4.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}
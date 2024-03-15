import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        int p = 0;
        do {
            System.out.println("1. Register user. \n2. Register user and lend a book. \n3. Register book.\n4. Lend a book.\n5. Show users.\n6. Show books.\n7. Show users with books.\n8. Show available books.\n9. Show unavailable books.\n0. Quit\n ");
            System.out.print("Select an option: ");
            p = sc.nextInt();
            sc.nextLine();

            switch (p) {
                case 1:
                    lib.addUser();
                    System.in.read();
                    break;
                case 2:
                    lib.addUserAndBook();
                    System.in.read();
                    break;
                case 3:
                    lib.addBook();
                    System.in.read();
                    break;
                case 4:
                    lib.preOrder();
                    System.in.read();
                    break;
                case 5:
                    lib.showUsers();
                    System.in.read();
                    break;
                case 6:
                    lib.showBooks();
                    System.in.read();
                    break;
                case 7:
                    lib.showUsersWithBooks();
                    System.in.read();
                    break;
                case 8:
                    lib.showAvailableBooks();
                    System.in.read();
                    break;
                case 9:
                    lib.showUnavailableBooks();
                    System.in.read();
                    break;

                case 0:
                    System.out.println("Cheers");
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        } while (p != 0);

    }
}

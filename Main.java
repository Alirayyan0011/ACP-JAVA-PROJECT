import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManager libraryManager = new LibraryManager();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter publish year: ");
                    int publishYear = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter book category: ");
                    String category = scanner.nextLine();

                    Book newBook = new Book(title, author, publishYear, category);
                    libraryManager.addBook(newBook);
                    break;

                case 2:
                    libraryManager.displayBooks();
                    break;

                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Try again!");
            }
        }
    }
}

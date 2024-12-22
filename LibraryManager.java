
import java.util.ArrayList;
import java.util.List;

public class LibraryManager implements LibraryInterface {
    private List<Book> books;

    public LibraryManager() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    @Override
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books to Display.");
        } else {
            for (Book book : books) {
                book.displayInfo();
                System.out.println("-------------------------");
            }
        }
    }
}

public class Book extends LibraryItem {

    public Book (String title, String author, int publishYear, String category) {
        super(title, author, publishYear, category);
    }

    @Override
    public void displayInfo() {
        System.out.println("Title:    " + title);
        System.out.println("Author:   " + author);
        System.out.println("Year:     " + publishYear);
        System.out.println("Category: " + category);
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublishYear() {
        return publishYear;
    }
}

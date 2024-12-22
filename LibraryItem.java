public abstract class LibraryItem {
    protected String title;    protected String author;
    protected int publishYear; protected String category;

    public LibraryItem (String title, String author, int publishYear, String category) {
        this.title       = title;
        this.author      = author;
        this.publishYear = publishYear;
        this.category    = category;
    }

    public abstract void displayInfo();
}

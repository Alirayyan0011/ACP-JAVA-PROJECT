public class Librarian extends User {

    public Librarian (String name) {
        super (name);
    }

    public void manageLibrary() {
        System.out.println( name + " is managing the library.");
    }
}

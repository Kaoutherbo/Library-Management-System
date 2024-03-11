public class Main {
    public static void main(String[] args) {
        // Testing the classes
        Book book1 = new Book("Atomic Habits", "PenguinRandomHouse", "James Clear");
        Internet website1 = new Internet("cybersecurity upskilling platform", "https://www.hackthebox.com/");
        Book book2 = new Book("Modern Operating Syetems", "Prentice Hall 1st-3rd Pearson PLC 4th", "ANDREW S. TANENBAUM");

        Library library = new Library(3);

        library.addDocument(book1);
        library.addDocument(website1);
        library.addDocument(book2);

        library.listing();

        System.out.println("Number of created documents: " + Document.getNumberOfDocuments());
    }
}
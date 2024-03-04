public class Main {
    public static void main(String[] args) {
        // Testing the classes
        Book book1 = new Book("o Kill a Mockingbird", "Harper Perennial Modern Classics", "Harper Lee");
        Internet website1 = new Internet("My Github profile", "https://github.com/Kaoutherbo");
        Book book2 = new Book("The Great Gatsby", "Scribner", "F. Scott Fitzgerald");

        Library library = new Library(3);

        library.addDocument(book1);
        library.addDocument(website1);
        library.addDocument(book2);

        library.listing();

        System.out.println("Number of created documents: " + Document.getNumberOfDocuments());
    }
}
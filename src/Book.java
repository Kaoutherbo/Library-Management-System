class Book extends Document {
    // Attributes for Book
    String publisher;
    String author;

    // Constructor for Book
    public Book(String title, String publisher, String author) {
        super(title); // constructor of the super class Document is called here.
        this.publisher = publisher;
        this.author = author;
    }

    // Methods for Book
    public void display() {
        super.display(); // Call the display method of the super class Document
        System.out.println("Publisher: " + publisher);
        System.out.println("Author: " + author);
    }
}


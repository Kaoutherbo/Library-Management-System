class Book extends Document {
    // Attributes for Book
    String publisher;
    String author;

    // Constructor for Book
    public Book(String title, String publisher, String author) {
        super(title);
        this.publisher = publisher;
        this.author = author;
    }

    // Methods for Book
    public void display() {
        super.display();
        System.out.println("Publisher: " + publisher);
        System.out.println("Author: " + author);
    }
}


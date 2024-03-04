class Document {
    // Attributes of the Document class
    String title;
    private static int numberOfDocuments = 0;

    // Constructor of the Document class
    public Document() {
        numberOfDocuments++;
    }

    // Constructor of the Document class with title params
    public Document(String title) {
        this.title = title;
        numberOfDocuments++;
    }

    // Methods
    public void display() {
        System.out.println("Title: " + title);
    }

    public static int getNumberOfDocuments() {
        return numberOfDocuments;
    }
}

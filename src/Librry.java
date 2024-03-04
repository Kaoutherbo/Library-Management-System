class Library {
    // Attributes
    Document[] documents;

    // Constructor
    public Library(int maxSize) {
        documents = new Document[maxSize];
    }

    // Method to add a document to the library
    public void addDocument(Document d) {
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] == null) {
                documents[i] = d;
                return; // Exit the loop after adding the document
            }
        }
        System.out.println("Library full, unable to add the document.");
    }

    // Method to list and display the content of the library
    public void listing() {
        for (Document document : documents) {
            if (document != null) {
                document.display();
                System.out.println("------------------------");
            }
        }
    }
}

class Library {
    // Attributes
    Document[] documents; // array of documents

    // Constructor
    public Library(int maxSize) {
        documents = new Document[maxSize];
    }

    // Method to add a document to the library 
    public void addDocument(Document d) { 
        for (Document document : documents) { //  enhanced for loop
            if (document == null) {
                document = d;
                return;
            }
        }
        System.out.println("Library full, unable to add the document.");
    }    

    // Method to list and display the content of the library
    public void listing() {
        for (Document document : documents) {
            if (document != null) {
                document.display();
                System.out.println("*****************************");
            }
        }
    }
}

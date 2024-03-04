class Internet extends Document {
    // Additional attribute for Website
    String URL;

    // Constructor
    public Internet(String title, String URL) {
        super(title);
        this.URL = URL;
    }

    // Method for Website
    public void display() {
        super.display();
        System.out.println("URL: " + URL);
    }
}
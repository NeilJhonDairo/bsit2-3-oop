public class Main {
    public static void main(String[] args) {
        System.out.println("=== Library Management System ===\n");

        System.out.println("--- Current Books ---");
        LibraryManager libManager = new LibraryManager();
        libManager.displayBooks();
        libManager.addBook();
        libManager.removeBook();

        System.out.println("Program completed successfully.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Library Management System -----\n");

        System.out.println("Adding books to library...");
        Library library = new Library();

        Book Bok1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
        Book Bok2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
        Book Bok3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);

        library.addBook(Bok1);
        library.addBook(Bok2);
        library.addBook(Bok3);

        library.displayAllBooks();

        System.out.println("\nBorrowing Java Programming...");
        library.borrowBook("1234567890");

        System.out.println("\nTrying to borrow Java Programming again...");
        library.borrowBook("1234567890");

        library.displayAllBooks();

        System.out.println("\nReturning Java Programming...");
        library.returnBook("1234567890");

        System.out.println("\nTesting validation...");
        Book invalidBook = new Book("", "", "123", 1400);
    }
}
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("A gentle reminder", "Bianca Sparacino", 130);
        Book book2 = new Book("Titan Academy of Special Abilities", "April Avery", 260);
        Book book3 = new Book("Olympus Academy", "Mahriyumm", 169);

        System.out.println("\n===== BOOK 1 =====");
        book1.displayInfo();
        book1.borrowBook();
        book1.displayInfo();
        book1.returnBook();
        book1.displayInfo();

        System.out.println("\n===== BOOK 2 =====");
        book2.displayInfo();
        book2.borrowBook();
        book2.displayInfo();
        book2.returnBook();
        book2.displayInfo();

        System.out.println("\n===== BOOK 3 =====");
        book3.displayInfo();
        book3.borrowBook();
        book3.displayInfo();
        book3.returnBook();
        book3.displayInfo();
    }
}

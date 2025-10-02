import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Borrowable> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    public void addItem(Borrowable item) {
        items.add(item);
    }

    public void displayAllItems() {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                LibraryItem libItem = (LibraryItem) item;
                System.out.println(libItem.getItemInfo() + " (" + item.getBorrowingStatus() + ")");
            }
        }
    }

    public void borrowItem(String itemId, String borrowerName) {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                LibraryItem libItem = (LibraryItem) item;
                if (libItem.itemId.equals(itemId)) {
                    if (item.isAvailable()) {
                        item.borrowItem(borrowerName);
                        System.out.println(borrowerName + " borrowed: " + libItem.getItemInfo());
                    } else {
                        System.out.println("Item " + itemId + " is not available.");
                    }
                    return;
                }
            }
        }
        System.out.println("Item with ID " + itemId + " not found.");
    }

    public void returnItem(String itemId) {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                LibraryItem libItem = (LibraryItem) item;
                if (libItem.itemId.equals(itemId)) {
                    if (!item.isAvailable()) {
                        item.returnItem();
                        System.out.println("Returned item: " + libItem.getItemInfo());
                    } else {
                        System.out.println("Item " + itemId + " was not borrowed.");
                    }
                    return;
                }
            }
        }
        System.out.println("Item with ID " + itemId + " not found.");
    }
    public void displayAvailableItems() {
        for (Borrowable item : items) {
            if (item.isAvailable() && item instanceof LibraryItem) {
                LibraryItem libItem = (LibraryItem) item;
                System.out.println(libItem.getItemInfo() + " (" + item.getBorrowingStatus() + ")");
            }
        }
    }

    public double calculateTotalLateFees(int daysLate) {
        double total = 0;
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                total += ((LibraryItem) item).calculateLateFee(daysLate);
            }
        }
        return total;
    }
}


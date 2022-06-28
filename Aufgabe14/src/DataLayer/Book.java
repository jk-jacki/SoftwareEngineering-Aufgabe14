package DataLayer;

import java.util.Date;

public class Book {
    private String title;
    private int isbn;
    private int inventoryID=0;

    private Date returnDate;

    public Book(String title, int isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(int inventoryID) {
        this.inventoryID = inventoryID;
    }

    public Date getReturnDate(){return returnDate;}
}

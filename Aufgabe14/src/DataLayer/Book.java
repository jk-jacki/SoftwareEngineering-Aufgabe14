package DataLayer;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Book {
    private String title;
    private int isbn;
    private int inventoryID=0;

    private Date returnDate;

    public Book(String title, int isbn) {
        this.title = title;
        this.isbn = isbn;
        this.returnDate =  null;
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

    public void setReturnDate(){
        returnDate = Date.from((LocalDate.now().plusMonths(1)).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }
    public void setNewReturnDate(){
        Calendar c = Calendar.getInstance();
        c.setTime(returnDate);
        c.add(Calendar.DAY_OF_MONTH, 14);
        returnDate = c.getTime();
    }

}

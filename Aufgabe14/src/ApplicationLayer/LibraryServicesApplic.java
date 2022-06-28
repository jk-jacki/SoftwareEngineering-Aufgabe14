package ApplicationLayer;

import DataLayer.Book;
import DataLayer.Library;
import DataLayer.User;

import java.util.ArrayList;

public class LibraryServicesApplic {
    //add new book
    public void addBook(Book book) {
        Library.addBook(book);
    }

    public Book newBook(String title, int isbn) {
        return new Book(title, isbn);
    }

    //rent book
    public ArrayList<String> getAvailableTitles() {
        ArrayList<String> available = new ArrayList<>();
        for (String s : Library.inventory.keySet()) {
            if (!Library.inventory.get(s).isEmpty()) {
                available.add(s);
            }
        }
        return available;
    }
    public void rentBook(String title) {
        // Don't allow user to rent multiple instances of one title, this would cause problems
        if (User.activeUser.rentedBooks.containsKey(title)) {
            throw new IllegalArgumentException("you have already rented this book. return it first.");
        }
        // remove from library
        Book rent = Library.inventory.get(title).pop();
        // add to user stash
        User.activeUser.rentedBooks.put(title, rent);
    }

    //Return book
    public String[] getRentedBooks() {
        return User.activeUser.rentedBooks.keySet().toArray(new String[0]);
    }

    public void returnBook(String title) {
        // take book out of user stash
        Book toReturn = User.activeUser.rentedBooks.remove(title);
        // put back into library
        Library.inventory.get(title).push(toReturn);
    }

    public User createUser(String name, String password, boolean admin) {
        // control if name is already taken
        if (User.allUsers.containsKey(name)) {
            throw new RuntimeException("name is already taken");
        }
        // Check if input only contains Letters
        for (char c : name.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                throw new RuntimeException("Only letters are allowed in names ");
            }
        }
        return new User(name, password, admin);
    }
}

package UILayer;

import ApplicationLayer.LibraryServicesApplic;
import DataLayer.Library;
import DataLayer.User;

import java.util.ArrayList;

public class LibaryServices {
    private LibraryServicesApplic control = new LibraryServicesApplic();

    public LibaryServices(){}

    public void chooseAction(){
        System.out.println("Please choose an action of the following choices:" );
        String[] choices = {"Add new user", "Add new book", "Rent book", "Return book", "Extend return date"};
        String action = ConsoleInput.choose(choices);

        switch (action){
            case "Add new user":
                newUser();
                break;
            case "Add new book":
                addBook();
                break;
            case "Rent book":
                rentBook();
                break;
            case "Return book":
                returnBook();
                break;
            case "Extend return date":
                extendBook();
                break;
        }

    }


    //Add new book
    public void addBook() {
        System.out.println("=== Add new book ===");
        String title = ConsoleInput.insert("enter title: ");
        int isbn = Integer.parseInt(ConsoleInput.insert("enter isbn: "));
        control.addBook(control.newBook(title, isbn));
    }

    //Rent book
    public void rentBook() {
        String[] availableTitles = control.getAvailableTitles().toArray(new String[0]);
        System.out.println("=== Rent Book ===");
        System.out.println("choose from available titles: ");
        String selectedTitle = ConsoleInput.choose(availableTitles);
        if (selectedTitle.equals(""))
            return;
        try {
            control.rentBook(selectedTitle);
        } catch (Exception e) {
            System.out.println("renting process failed:");
            System.out.println(e.getMessage());
        }
    }

    //Return Book
    public void returnBook() {
        System.out.println("=== Return book ===");
        System.out.println("select title you want to return: ");
        String[] rentedBooks = control.getRentedBooks();  // all books rented by user
        String toReturn = ConsoleInput.choose(rentedBooks);  // select one
        if (!toReturn.equals(""))
            control.returnBook(toReturn);  // return selected
    }

    //create new User
    public void newUser() {
        System.out.println("=== Create new User ===");
        // get data for new Sachbearbeiter
        String name = ConsoleInput.insert("Name: ");
        if (name.equals("cancel")) {
            chooseAction();
        }
        String password = ConsoleInput.insert("Passwort: ");
        if (password.equals("cancel")) {
            return;
        }
        User instance;
        boolean admin = false;
        String[] choices = new String[2];
        choices[0] = "yes";
        choices[1] = "no";
        System.out.println("Do you want to give user admin rights?");
        String choice = ConsoleInput.choose(choices);
        if (choice.equals(choices[0])) {
            admin=true;
        }
        try {
            instance = control.createUser(name,password,admin);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;

        }
        User.allUsers.put(name, instance);
    }

    public void extendBook(){
        System.out.println("=== Extend book ===");
        System.out.println("select title you want to extend: ");
        String[] rentedBooks = control.getRentedBooks();  // all books rented by user
        String toExtend = ConsoleInput.choose(rentedBooks);  // select one
        if (!toExtend.equals(""))
            control.extendReturnDate(toExtend);  // return selected

    }
}

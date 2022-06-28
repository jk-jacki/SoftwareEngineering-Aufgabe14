import DataLayer.Book;
import DataLayer.Library;
import DataLayer.User;
import UILayer.LibaryServices;

public class Main {
    public static void main(String[] Args) {

        User user1 = new User("admin", "admin", true);
        User user2 = new User("user", "user", false);
        User.allUsers.put("admin", user1);
        User.allUsers.put("user", user2);

        Library.addBook(new Book("Harry Potter", 123));
        Library.addBook(new Book("Dune", 234));
        Library.addBook(new Book("Shadow and Bone", 432));

        LibaryServices service = new LibaryServices();

        while(true)
            service.chooseAction();

        //System.out.println("Program finished without problems.");

    }
}

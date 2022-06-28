package DataLayer;
import java.util.HashMap;

public class User {
    // static attributes
    public static User activeUser;
    public static HashMap<String, User>  allUsers = new HashMap<>();
    public static HashMap<String, Book> rentedBooks = new HashMap<>();

    // private attributes
    private String name;
    private String password;
    private boolean isAdmin;

    // ctor
    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
        this.activeUser = this;
    }

    // get set
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean matchesPassword(String password) {
        if (this.password.equals(password)) {
            return true;
        } else { return false; }
    }

    public static String[] getUserNames() {
        return User.allUsers.keySet().toArray(new String[0]);
    }
    public String getName(String name) {return this.name; }

    public void copyUserStats(User instance){
        this.name = instance.name;
        this.isAdmin = instance.isAdmin;
        this.password = instance.password;
        this.rentedBooks = instance.rentedBooks;
        if (instance.name != this.name){
            allUsers.remove(this.name);
            allUsers.put(instance.name,this);
            this.name = instance.name;
        }
    }
}

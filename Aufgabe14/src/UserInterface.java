import java.util.Date;
import java.util.Scanner;
public interface UserInterface {
    Scanner scanner = new Scanner(System.in);

    int chooseAction();
    Ausleiher addNewAusleiher(int userID);
    void addToBibliotheksbestand(Persistenzschicht persistenzschicht);
    boolean borrowBook();
    Date extendBook();
    boolean returnBook();

}

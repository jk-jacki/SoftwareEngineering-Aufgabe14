import java.util.Date;
import java.util.Scanner;
public interface UserInterface {
    Scanner scanner = new Scanner(System.in);

    abstract Ausleiher ausleiherAnlegen();
    abstract void hinzufügenBibliotheksbestand();
    abstract boolean ausleihenBuch();
    abstract Date verlängereBuch();
    abstract boolean rückgabeBuch();
}
